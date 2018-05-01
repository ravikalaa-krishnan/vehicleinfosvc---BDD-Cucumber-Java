package uk.gov.dvla.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import uk.gov.dvla.services.model.VehicleInfo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * File related methods are kept here
 * *reading from CSV
 * *read from Excel workbook
 */
public class FileUtils {

    public static List<VehicleInfo> readFromCSVFile(String fileName) {
        String line = "";
        String csvSeparator = ",";
        List<VehicleInfo> vehicleList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] vehicleData = line.split(csvSeparator);
                VehicleInfo vehicle = new VehicleInfo();
                vehicle.setRegNumber(vehicleData[0]);
                vehicle.setMake(vehicleData[1]);
                vehicle.setColour(vehicleData[2]);
                vehicleList.add(vehicle);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vehicleList;
    }


    public static List<VehicleInfo> readFromExcelFile(String fileName) {
        List<VehicleInfo> vehicleList = new ArrayList<>();
        try {
            FileInputStream excelFile = new FileInputStream(fileName);
            try {
                Workbook workbook = new XSSFWorkbook(excelFile);
                Sheet datatypeSheet = workbook.getSheetAt(0);
                Iterator<Row> iterator = datatypeSheet.iterator();
                iterator.next();
                while (iterator.hasNext()) {
                    VehicleInfo vehicle = new VehicleInfo();
                    Row currentRow = iterator.next();
                    vehicle.setRegNumber(currentRow.getCell(0).getStringCellValue());
                    vehicle.setMake(currentRow.getCell(1).getStringCellValue());
                    vehicle.setColour(currentRow.getCell(2).getStringCellValue());
                    vehicleList.add(vehicle);
                }
            } finally {
                excelFile.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vehicleList;
    }

}
