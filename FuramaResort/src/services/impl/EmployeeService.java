package services.impl;

import models.person.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        employeeRepository.display();
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Employee findEmployeeById(String id) {
        return null;
    }

    @Override
    public void edit(Employee employee) {

    }


}
