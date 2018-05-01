package uk.gov.dvla.services.model;


/**
 * Class to encapulate the Vehicle related data and methods
 */
public class VehicleInfo {
    private String regNumber;
    private String make;
    private String colour;

    public VehicleInfo(String regNumber, String make, String colour) {
        this.regNumber = regNumber;
        this.make = make;
        this.colour = colour;
    }

    public VehicleInfo() {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "regNumber='" + regNumber + '\'' +
                ", make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
