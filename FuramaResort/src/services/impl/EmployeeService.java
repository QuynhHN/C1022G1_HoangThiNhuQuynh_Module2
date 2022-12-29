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
        employeeRepository.add(employee);
    }

    @Override
    public void delete(String id) {
        employeeRepository.delete(id);
    }

    @Override
    public Employee findEmployeeById(String id) {
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public void edit(Employee employee) {
        employeeRepository.edit(employee);
    }


}
