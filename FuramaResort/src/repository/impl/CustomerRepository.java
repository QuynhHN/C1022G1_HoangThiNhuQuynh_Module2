package repository.impl;

import models.person.Customer;
import repository.ICustomerRepository;
import utils.ReadAndWriteCustomer;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer("b001", "Nguyễn Văn A", "14/6/1988", "male", "12345678", "0909123456", "nguyenvanA@gmail.com", "89 Hùng Vương, Thanh Khê, Đà Nẵng", "Diamond"));
        customerList.add(new Customer("b002", "Trần Van B", "18/01/1987", "male", "2355788", "0907234567", "tranvanB@gmail.com", "167 Nguyễn Văn Linh, TP.Buôn Ma Thuột", "Gold"));
        customerList.add(new Customer("b003", "Nguyễn Mỹ Linh", "22/9/1995", "female", "1298767", "0989123221", "nguyenmylinh@gmail.com", "22 Nguyễn Trãi, Đà Nẵng", "Member"));
    }

    @Override
    public void display() {
        customerList = ReadAndWriteCustomer.readFileCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Customer customer) {
        customerList = ReadAndWriteCustomer.readFileCustomer();
        customerList.add(customer);
        ReadAndWriteCustomer.writeFile(customerList);
    }

    @Override
    public Customer findCustomerById(String id) {
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void edit(Customer customer) {
        customerList = ReadAndWriteCustomer.readFileCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(customer.getId())) {
                customerList.set(i, customer);
                break;
            }
        }
        ReadAndWriteCustomer.writeFile(customerList);
    }
}
