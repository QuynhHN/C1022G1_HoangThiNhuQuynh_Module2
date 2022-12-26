package services.impl;

import models.person.Employee;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    static{
        employeeList.add(new Employee(1,"Trần Văn A","22-12-2000","male","190200234","0905021032","tranvana@gmail.com"));
        employeeList.add(new Employee(2,"Nguyễn Kim B","02-02-1999","female","223091567","0365789077","nguyenkimb@gmail.com"));
    }

    @Override
    public void display() {

    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public int findID(int id) {
        return 0;
    }

    @Override
    public void add() {

    }
}
