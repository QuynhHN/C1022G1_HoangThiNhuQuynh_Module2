package utils;

import models.facility.Facility;
import models.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadAndWriteVilla {
    public static final String FILE_PATH = "src\\data\\villa.csv";

    public static Map<Facility, Integer> readFile() {
        Map<Facility, Integer> villaMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String serviceName = temp[0];
                String name = temp[1];
                String usableArea = temp[2];
                String rentalCosts = temp[3];
                String maximumNumberOfPeople = temp[4];
                String rentalType = temp[5];
                String roomStandard = temp[6];
                String poolArea = temp[7];
                String numberOfFloors = temp[8];
                Villa villa = new Villa(serviceName, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, poolArea, numberOfFloors);
                villaMap.put(villa, Integer.parseInt(temp[9]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return villaMap;
    }

    public static void writeFile(Map<Facility, Integer> villaMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> entry : villaMap.entrySet()) {
                if(entry.getKey() instanceof Villa) {
                    bufferedWriter.write(((Villa) entry.getKey()).formatCSVVilla() + "," + entry.getValue());
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
