package utils;

import models.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteVilla {
    public static final String FILE_PATH = "C:\\Users\\DELL\\Desktop\\CODEGYM\\module_2\\FuramaResort\\src\\models\\facility\\Villa.java";

    public static Map<Villa,Integer> readFile(){
        Map<Villa,Integer> villaMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader =  null;
        try{
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line = bufferedReader.readLine())!=null){
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
                Villa villa = new Villa(serviceName,name,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,roomStandard,poolArea,numberOfFloors);
                villaMap.put(villa,Integer.parseInt(temp[9]));
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
    public static void writeFile(Map<Villa,Integer> villaMap){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa,Integer> entry : villaMap.entrySet()){
                bufferedWriter.write(entry.getKey().formatCSVVilla() + "," + entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
