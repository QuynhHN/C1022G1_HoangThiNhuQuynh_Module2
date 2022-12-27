package controllers;

import models.person.Employee;
import services.IEmployeeService;
import services.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public IEmployeeService displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        IEmployeeService employeeService = new EmployeeService();
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Delete employee\n " +
                    "4. Edit employee\n" +
                    "5. Return main menu\n" +
                    "-----------------\n" +
                    "Input your choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    System.out.println("Nhập vào mã nhân viên");
                    String id = sc.nextLine();
                    System.out.println("Nhập vào tên");
                    String name = sc.nextLine();
                    System.out.println("Nhập vào ngày sinh");
                    String dateOfBirth = sc.nextLine();
                    System.out.println("Nhập vào giới tính");
                    String gender = sc.nextLine();
                    System.out.println("Nhập vào số chứng minh nhân dân");
                    String idCode = sc.nextLine();
                    System.out.println("Nhập vào số điện thoại");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Nhập vào email");
                    String email = sc.nextLine();
                    employeeService.add(new Employee(id, name, dateOfBirth, gender, idCode, phoneNumber, email));
                    break;
                case 3:
                    System.out.println("Nhập vào mã nhân viên cần xóa");
                    id = sc.nextLine();
                    employeeService.delete(id);
                    break;
                case 4:

                    break;
                case 5:
                    return employeeService;

                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }

}
