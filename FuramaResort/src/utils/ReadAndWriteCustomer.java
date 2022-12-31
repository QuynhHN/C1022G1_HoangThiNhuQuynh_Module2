package utils;

import models.person.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteCustomer {
    public static final String FILE_PATH = "C:\\Users\\DELL\\Desktop\\CODEGYM\\module_2\\FuramaResort\\src\\data\\customer.csv";

    public static List<Customer> readFile(){
        List<Customer> customerList = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line=bufferedReader.readLine())!=null){
                temp = line.split(",");
                String id = temp[0];
                String name = temp[1];
                String date = temp[2];
                String gender = temp[3];
                String cMND = temp[4];
                String phone = temp[5];
                String email = temp[6];
                String customerType= temp[7];
                String address = temp[8];
                Customer customer = new Customer(id,name,date,gender,cMND,phone,email,customerType,address);
                customerList.add(customer);
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
        return customerList;
    }
    public static void writeFile(List<Customer> customerList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList){
                bufferedWriter.write(customer.formatCSVCustomer());
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
