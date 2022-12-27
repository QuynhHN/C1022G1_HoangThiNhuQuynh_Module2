package repository.impl;

import controllers.EmployeeManagement;
import controllers.FuramaController;
import models.person.Employee;
import repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("a001", "Trần Văn A", "22-12-2000", "male", "190200234", "0905021032", "tranvana@gmail.com"));
        employeeList.add(new Employee("a002", "Nguyễn Kim B", "02-02-1999", "female", "223091567", "0365789077", "nguyenkimb@gmail.com"));
    }

    @Override
    public void display() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < employeeList.size(); i++) {
            employeeList.remove(employeeList.get(i));
        }
    }

    @Override
    public Employee findEmployeeById(String id) {
        return null;
    }

    @Override
    public void edit(Employee employee) {

    }
}
