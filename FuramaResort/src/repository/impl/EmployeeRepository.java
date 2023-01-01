package repository.impl;

import controllers.EmployeeManagement;
import controllers.FuramaController;
import models.person.Employee;
import repository.IEmployeeRepository;
import utils.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("a001", "Trần Văn A", "22-12-2000", "Male", "190200234", "0905021032", "tranvana@gmail.com", "After University", "President", "5000000"));
        employeeList.add(new Employee("a002", "Nguyễn Kim B", "02-02-1999", "Female", "223091567", "0365789077", "nguyenkimb@gmail.com", "University", "Manager", "4000000"));
        employeeList.add(new Employee("a003", "Phạm Thanh Hải", "11-04-1990", "Male", "1230888367", "0909145623", "phamthanhhai@gmail.com", "College", "Monitor", "4000000"));
    }

    @Override
    public void display() {
        employeeList = ReadAndWriteEmployee.readEmployee();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList = ReadAndWriteEmployee.readEmployee();
        employeeList.add(employee);
        ReadAndWriteEmployee.writerFile(employeeList);
    }

    @Override
    public void delete(String id) {
        employeeList=ReadAndWriteEmployee.readEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            employeeList.remove(employeeList.get(i));
        }
        ReadAndWriteEmployee.writerFile(employeeList);
    }

    @Override
    public Employee findEmployeeById(String id) {
        for (Employee e : employeeList) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void edit(Employee employee) {
        employeeList=ReadAndWriteEmployee.readEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(employee.getId())) {
                employeeList.set(i, employee);
                break;
            }
        }
        ReadAndWriteEmployee.writerFile(employeeList);
    }
}
