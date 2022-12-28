package services;

import models.person.Employee;

public interface IEmployeeService {
    void display();

    void add(Employee employee);

    void delete(String id);

    Employee findEmployeeById(String id);

    void edit(Employee employee);


}
