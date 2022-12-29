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
                    "3. Delete employee\n" +
                    "4. Edit employee\n" +
                    "5. Return main menu\n" +
                    "-----------------\n" +
                    "Input your choice");
            int choiceEmployee = Integer.parseInt(sc.nextLine());
            switch (choiceEmployee) {
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
                    System.out.println("Nhập vào trình độ");
                    String academicLevel = sc.nextLine();
//                    int choice2= Integer.parseInt(sc.nextLine());
//                    System.out.println("------ Choice academic level-----\n"+
//                            "1. Trung cấp \n" +
//                            "2. Cao đẳng \n" +
//                            "3. Đại học \n" +
//                            "4. Sau đại học \n" +
//                            "-----------------\n" +
//                            "Input your choice");
//                    switch (choice2){
//                        case 1:
//
//
//                    }

                    System.out.println("Nhập vào vị trí");
                    String position = sc.nextLine();
                    System.out.println("Nhập vào lương");
                    String salary = sc.nextLine();
                    employeeService.add(new Employee(id, name, dateOfBirth, gender, idCode, phoneNumber, email, academicLevel, position, salary));
                    break;
                case 3:
                    System.out.println("Nhập vào mã nhân viên cần xóa");
                    id = sc.nextLine();
                    employeeService.delete(id);
                    break;
                case 4:
                    System.out.println("Nhập vào mã nhân viên cần sửa");
                    String idFix = sc.nextLine();
                    Employee employee = employeeService.findEmployeeById(idFix);
                    if (employee != null) {
                            System.out.println("-----Choice menu-----\n" +
                                    "1. Edit name \n" +
                                    "2. Edit dayOfBirth \n" +
                                    "3. Edit gender \n" +
                                    "4. Edit idCode \n" +
                                    "5. Edit phoneNumber \n" +
                                    "6. Edit email \n" +
                                    "7. Edit academicLevel \n" +
                                    "8. Edit position \n" +
                                    "9. Edit salary \n" +
                                    "10. Return main menu" +
                                    "-----------------\n" +
                                    "Input your choice");
                            int choice1 = Integer.parseInt(sc.nextLine());
                            switch (choice1) {
                                case 1:
                                    System.out.println("Nhập vào tên cần thay đổi");
                                    String newName= sc.nextLine();
                                    employee.setName(newName);
                                    employeeService.edit(employee);
                                    break;
                                case 2:
                                    System.out.println("Nhập vào ngày sinh");
                                    String newDayOfBirth =sc.nextLine();
                                    employee.setDayOfBirth(newDayOfBirth);
                                    employeeService.edit(employee);
                                    break;
                                case 3:
                                    System.out.println("Nhập giới tính");
                                    String newGender =sc.nextLine();
                                    employee.setGender(newGender);
                                    employeeService.edit(employee);
                                    break;
                                case 4:
                                    System.out.println("Nhập vào số chứng minh");
                                    String newIdCode =sc.nextLine();
                                    employee.setIdCode(newIdCode);
                                    employeeService.edit(employee);
                                    break;
                                case 5:
                                    System.out.println("Nhập vào số điện thoại");
                                    String newPhoneNumber =sc.nextLine();
                                    employee.setPhoneNumber(newPhoneNumber);
                                    employeeService.edit(employee);
                                    break;
                                case 6:
                                    System.out.println("Nhập vào email");
                                    String newEmail =sc.nextLine();
                                    employee.setEmail(newEmail);
                                    employeeService.edit(employee);
                                    break;
                                case 7:
                                    System.out.println("Nhập trình độ học vấn");
                                    String newAcademicLevel =sc.nextLine();
                                    employee.setAcademicLevel(newAcademicLevel);
                                    employeeService.edit(employee);
                                    break;
                                case 8:
                                    System.out.println("Nhập vào vị trí");
                                    String newPosition =sc.nextLine();
                                    employee.setPosition(newPosition);
                                    employeeService.edit(employee);
                                    break;
                                case 9:
                                    System.out.println("Nhập vào lương");
                                    String newSalary =sc.nextLine();
                                    employee.setSalary(newSalary);
                                    employeeService.edit(employee);
                                    break;
                                default:
                                    System.exit(0);
                            }
                    }else{
                        System.out.println("Not existed");
                    }
                    break;
                case 5:
                    return employeeService;

                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }

}
