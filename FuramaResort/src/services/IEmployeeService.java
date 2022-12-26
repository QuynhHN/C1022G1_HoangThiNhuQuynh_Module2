package services;

import models.person.Employee;

public interface IEmployeeService {
    void display();
    void add(Employee employee);
    int findID(int id);

    void add();
}
