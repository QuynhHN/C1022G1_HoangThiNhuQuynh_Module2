package utils;

import models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {

    public static final String FILE_PATH = "src\\data\\employee.csv";

public static List<Employee>readEmployee (){
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Employee employee1;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                String id = temp[0];
                String name = temp[1];
                String dayOfBirth = temp[2];
                String gender = temp[3];
                String idCode = temp[4];
                String phoneNumber = temp[5];
                String email = temp[6];
                String academicLevel = temp[7];
                String position = temp[8];
                String salary = temp[9];
                employee1 = new  Employee(id, name, dayOfBirth, gender, idCode, phoneNumber, email, academicLevel, position, salary);
                employeeList.add(employee1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  employeeList;
    }
    public static void writerFile(List<Employee> employeeList){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList){
                bufferedWriter.write(employee.formatCSVEmployee());
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

