package uk.gov.dvla.utils;

import uk.gov.dvla.services.model.VehicleInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to capture other useful methods - non related to business logic which can be used in anywhere in the project
 */
public class HelperUtils {


    public static Map<String, List<String>> objectsToHashmap(List<VehicleInfo> vehicles) {

        Map<String, List<String>> resultsMap = new HashMap<String, List<String>>();
        for (VehicleInfo vehicle : vehicles) {
            resultsMap.put(vehicle.getRegNumber(), java.util.Arrays.asList(vehicle.getMake(), vehicle.getColour()));
        }

        System.out.println("============Master Test data obtained from Excel and CSV files ======================================");
        System.out.println(resultsMap);
        System.out.println("=====================================================================================================");
        System.out.println("Test data details for Specific Vehicle Registration Number : ");
        String registrationNum = "LB64CDO";
        System.out.println("Registration Number " + registrationNum + "-->" + resultsMap.get(registrationNum));
        return resultsMap;
    }


}
