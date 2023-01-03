package utils;

import models.person.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteCustomer {
    public static final String FILE_PATH = "src\\data\\customer.csv";

    public static List<Customer> readFileCustomer() {
        List<Customer> customerList = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String temp[] = line.split(",");
                String id = temp[0];
                String name = temp[1];
                String dayOfBirth = temp[2];
                String gender = temp[3];
                String idCode = temp[4];
                String phoneNumber = temp[5];
                String email = temp[6];
                String address = temp[7];
                String typeOfGuest = temp[8];
                Customer customer = new Customer(id, name, dayOfBirth, gender, idCode, phoneNumber, email, address, typeOfGuest);
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

    public static void writeFile(List<Customer> customerList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.formatCSVCustomer());
                bufferedWriter.newLine();
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
