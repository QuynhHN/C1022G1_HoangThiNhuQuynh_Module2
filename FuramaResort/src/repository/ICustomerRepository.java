package repository;

import models.person.Customer;

public interface ICustomerRepository {
    void display();

    void add(Customer customer);

    Customer findCustomerById(String id);

    void edit(Customer customer);
}
