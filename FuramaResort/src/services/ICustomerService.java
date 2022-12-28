package services;

import models.person.Customer;

public interface ICustomerService {
    void display();

    void add(Customer customer);

    Customer findCustomerById(String id);

    void edit(Customer customer);
}
