package controllers;

import models.person.Customer;
import models.person.Employee;
import services.ICustomerService;
import services.impl.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    public ICustomerService displayMainMenuCustomer() {
        Scanner sc = new Scanner(System.in);
        ICustomerService customerService = new CustomerService();
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Display list customers\n" +
                    "2. Add new customers\n" +
                    "3. Edit customers\n" +
                    "5. Return main menu\n" +
                    "-----------------\n" +
                    "Input your choice");
            int choice3 = Integer.parseInt(sc.nextLine());
            switch (choice3) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    System.out.println("Nhập vào mã khách hàng");
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
                    System.out.println("Nhập vào địa chỉ");
                    String address = sc.nextLine();
                    System.out.println("Nhập vào loại khách");
                    String typeOfGuest = sc.nextLine();
                    customerService.add(new Customer(id, name, dateOfBirth, gender, idCode, phoneNumber, email, address, typeOfGuest));
                    break;
                case 3:
                    System.out.println("Nhập vào mã khách hàng cần sửa");
                    String idFix1 = sc.nextLine();
                    Customer customer = customerService.findCustomerById(idFix1);
                    if (customer != null) {
                        System.out.println("-----Choice menu-----\n" +
                                "1. Edit name \n" +
                                "2. Edit dayOfBirth \n" +
                                "3. Edit gender \n" +
                                "4. Edit idCode \n" +
                                "5. Edit phoneNumber \n" +
                                "6. Edit email \n" +
                                "7. Edit address \n" +
                                "8. Edit type of Guest \n" +
                                "10. Return main menu" +
                                "-----------------\n" +
                                "Input your choice");
                        int choice1 = Integer.parseInt(sc.nextLine());
                        switch (choice1) {
                            case 1:
                                System.out.println("Nhập vào tên cần thay đổi");
                                String newName= sc.nextLine();
                                customer.setName(newName);
                                customerService.edit(customer);
                                break;
                            case 2:
                                System.out.println("Nhập vào ngày sinh");
                                String newDayOfBirth =sc.nextLine();
                                customer.setDayOfBirth(newDayOfBirth);
                                customerService.edit(customer);
                                break;
                            case 3:
                                System.out.println("Nhập giới tính");
                                String newGender =sc.nextLine();
                                customer.setGender(newGender);
                                customerService.edit(customer);
                                break;
                            case 4:
                                System.out.println("Nhập vào số chứng minh");
                                String newIdCode =sc.nextLine();
                                customer.setIdCode(newIdCode);
                                customerService.edit(customer);
                                break;
                            case 5:
                                System.out.println("Nhập vào số điện thoại");
                                String newPhoneNumber =sc.nextLine();
                                customer.setPhoneNumber(newPhoneNumber);
                                customerService.edit(customer);
                                break;
                            case 6:
                                System.out.println("Nhập vào email");
                                String newEmail =sc.nextLine();
                                customer.setEmail(newEmail);
                                customerService.edit(customer);
                                break;
                            case 7:
                                System.out.println("Nhập vào địa chỉ");
                                String newAddress =sc.nextLine();
                                customer.setAddress(newAddress);
                                customerService.edit(customer);
                                break;
                            case 8:
                                System.out.println("Nhập vào loại khách");
                                String newTypeOfGuest =sc.nextLine();
                                customer.setTypeOfGuest(newTypeOfGuest);
                                customerService.edit(customer);
                                break;
                            default:
                                System.exit(0);
                        }
                    }else{
                        System.out.println("Không tồn tại");
                    }
                    break;
                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }
}
