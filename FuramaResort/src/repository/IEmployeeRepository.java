package repository;

import models.person.Employee;

public interface IEmployeeRepository {
    void display();

    void add(Employee employee);

    void delete(String id);

    Employee findEmployeeById(String id);

    void edit(Employee employee);
}
