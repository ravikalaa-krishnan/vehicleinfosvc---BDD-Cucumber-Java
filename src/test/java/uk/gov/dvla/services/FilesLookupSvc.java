package uk.gov.dvla.services;


import org.apache.commons.io.FilenameUtils;
import uk.gov.dvla.services.model.FileInfo;
import uk.gov.dvla.services.model.VehicleInfo;
import uk.gov.dvla.utils.HelperUtils;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.exit;
import static uk.gov.dvla.utils.FileUtils.readFromCSVFile;
import static uk.gov.dvla.utils.FileUtils.readFromExcelFile;
import static uk.gov.dvla.utils.TestConstants.FILE_EXTNS;
import static uk.gov.dvla.utils.TestConstants.TESTDATA_DIR;

/**
 * This Service provides the following features :
 * 1.scan the all the files in a specific directory
 * 2.filter the required files based on the file extensions from the scanned files
 * 3.read the content from the files and store in a map for the purpose of test data provider
 */
public class FilesLookupSvc {
    List<File> list = new ArrayList<>();
    MimetypesFileTypeMap mimeTypes = new MimetypesFileTypeMap();

    // This is a test to check the functionalites are working as expected
    public static void main(String[] args) throws IOException {

        List<FileInfo> fileList = new ArrayList<>();
        List<VehicleInfo> vehicleList = new ArrayList<>();
        FilesLookupSvc fis = new FilesLookupSvc();
        fileList = fis.filterByFilesByExtensions(Arrays.asList(FILE_EXTNS));
        vehicleList = fis.getMasterTestDataFromTestFiles(fileList);
        HelperUtils.objectsToHashmap(vehicleList);
    }


    public List<FileInfo> scanAllFilesInADirectory() throws IOException {

        List<FileInfo> fileInfoList = new ArrayList<FileInfo>();

        File folder = new File(TESTDATA_DIR);
        File[] files = folder.listFiles();
        list = Arrays.asList(files);

        for (File file : list) {
            fileInfoList.add(getFileMetaDataInfo(file));

        }

        System.out.println("==========================List All available files from " + TESTDATA_DIR + " folder");
        for (FileInfo file : fileInfoList) {
            System.out.println(file);
        }
        System.out.println("Total Number of Files : " + fileInfoList.size());
        return fileInfoList;


    }


    private FileInfo getFileMetaDataInfo(File file) throws IOException {
        FileInfo fileMetaData = new FileInfo();

        fileMetaData.setName(file.getName());
        fileMetaData.setSize(file.length());
        fileMetaData.setExtension(FilenameUtils.getExtension(file.toString()));
        fileMetaData.setMimeType(mimeTypes.getContentType(file));
        fileMetaData.setPath(file.getCanonicalPath());
        return fileMetaData;
    }


    public List<FileInfo> filterByFilesByExtensions(List<String> fileExtensions) throws IOException {
        List<FileInfo> supportedFiles = new ArrayList<FileInfo>();
        for (FileInfo fileInfo : scanAllFilesInADirectory()) {
            if (fileExtensions.contains(fileInfo.getExtension())) {
                supportedFiles.add(fileInfo);
            }


        }

        System.out.println("===========Filter by Excel and CSV extensions==================================");
        for (FileInfo file : supportedFiles) {
            System.out.println(file);
        }
        System.out.println("Total Number of Files in Excel and CSV format : " + supportedFiles.size());
        return supportedFiles;
    }


    public List<VehicleInfo> getMasterTestDataFromTestFiles(List<FileInfo> files) {

        List<VehicleInfo> masterTestData = new ArrayList<VehicleInfo>();

        for (FileInfo file : files) {

            String fullFilePath = TESTDATA_DIR + "/" + file.getName();
            //determine the extension of the file - CSV ??
            if (file.getExtension().equals(FILE_EXTNS[0])) {

                masterTestData.addAll(readFromCSVFile(fullFilePath));
            } else if (file.getExtension().equals(FILE_EXTNS[1]))
                masterTestData.addAll(readFromExcelFile(fullFilePath));
            else {
                System.out.println("Unsupported file type found ->> " + file.getExtension());
                exit(0);
            }

        }
        return masterTestData;


    }
}