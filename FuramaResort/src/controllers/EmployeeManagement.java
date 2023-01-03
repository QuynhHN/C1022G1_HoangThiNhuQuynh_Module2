package controllers;

import models.person.Employee;
import services.IEmployeeService;
import services.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public IEmployeeService displayMainMenuEmployee() {
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
            int choiceEmployee = 0;
            try {
                choiceEmployee = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            switch (choiceEmployee) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    System.out.println("Input Id");
                    String id = sc.nextLine();
                    System.out.println("Input name");
                    String name = sc.nextLine();
                    System.out.println("Input day of birth");
                    String dateOfBirth = sc.nextLine();
                    System.out.println("Input gender");
                    String gender = sc.nextLine();
                    System.out.println("Input Id code");
                    String idCode = sc.nextLine();
                    System.out.println("Input phone number");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Input email");
                    String email = sc.nextLine();
                    System.out.println("Input Academic Level");
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

                    System.out.println("Input position");
                    String position = sc.nextLine();
                    System.out.println("Input salary");
                    String salary = sc.nextLine();
                    employeeService.add(new Employee(id, name, dateOfBirth, gender, idCode, phoneNumber, email, academicLevel, position, salary));
                    break;
                case 3:
                    System.out.println("Input id delete");
                    id = sc.nextLine();
                    if(employeeService!=null){
                        employeeService.delete(id);
                    }else{
                        try{
                            throw  new ExceptionFormat("Not is a Id");
                        } catch (ExceptionFormat exceptionFormat) {
                            exceptionFormat.printStackTrace();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Input id change");
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
                                "10. Return main menu\n" +
                                "-----------------\n" +
                                "Input your choice");
                        int choice1 = 0;
                        try {
                            choice1 = Integer.parseInt(sc.nextLine());
                        }catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                        switch (choice1) {
                            case 1:
                                System.out.println("Input name change");
                                String newName = sc.nextLine();
                                employee.setName(newName);
                                employeeService.edit(employee);
                                break;
                            case 2:
                                System.out.println("Input day of birth");
                                String newDayOfBirth = sc.nextLine();
                                employee.setDayOfBirth(newDayOfBirth);
                                employeeService.edit(employee);
                                break;
                            case 3:
                                System.out.println("Input gender");
                                String newGender = sc.nextLine();
                                employee.setGender(newGender);
                                employeeService.edit(employee);
                                break;
                            case 4:
                                System.out.println("Input Id Code");
                                String newIdCode = sc.nextLine();
                                employee.setIdCode(newIdCode);
                                employeeService.edit(employee);
                                break;
                            case 5:
                                System.out.println("Input phone number");
                                String newPhoneNumber = sc.nextLine();
                                employee.setPhoneNumber(newPhoneNumber);
                                employeeService.edit(employee);
                                break;
                            case 6:
                                System.out.println("Input email");
                                String newEmail = sc.nextLine();
                                employee.setEmail(newEmail);
                                employeeService.edit(employee);
                                break;
                            case 7:
                                System.out.println("Input Academic Level");
                                String newAcademicLevel = sc.nextLine();
                                employee.setAcademicLevel(newAcademicLevel);
                                employeeService.edit(employee);
                                break;
                            case 8:
                                System.out.println("Input Position");
                                String newPosition = sc.nextLine();
                                employee.setPosition(newPosition);
                                employeeService.edit(employee);
                                break;
                            case 9:
                                System.out.println("Input Salary");
                                String newSalary = sc.nextLine();
                                employee.setSalary(newSalary);
                                employeeService.edit(employee);
                                break;
                            case 10:
                                displayMainMenuEmployee();
                                break;
                            default:
                                System.out.println("Please input choice in menu");
                        }
                    } else {
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
