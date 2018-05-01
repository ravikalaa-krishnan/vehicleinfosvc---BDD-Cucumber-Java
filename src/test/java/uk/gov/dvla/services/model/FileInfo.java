package uk.gov.dvla.services.model;

import org.apache.tika.Tika;

import java.io.File;
import java.io.IOException;

/**
 * Class to encapulate the File related meta data and methods
 */

public class FileInfo {
    private String name;
    private String mimeType;
    private double size;
    private String extension;
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public String getName() {
        return name;
    }

    public void setName(String fileName) {
        this.name = fileName;

    }

    public String getMimeType() {
        return mimeType;
    }

    // method overloading
    public String getMimeType(final String fileName) {
        Tika mimeInfo = new Tika();
        String fileType;
        try {
            final File file = new File(fileName);
            fileType = mimeInfo.detect(file);
        } catch (IOException exp) {
            fileType = "Unknown";
        }
        return fileType;
    }

    public void setMimeType(String fileMimeType) {
        this.mimeType = fileMimeType;
    }


    public double getSize() {
        return size;
    }

    public void setSize(double fileSize) {
        this.size = fileSize;
    }


    public String getExtension() {
        return extension;
    }

    public void setExtension(String fileExtn) {
        this.extension = fileExtn;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "name='" + name + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", size=" + size +
                ", extension='" + extension + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
