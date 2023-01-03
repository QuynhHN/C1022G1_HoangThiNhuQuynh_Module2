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
                    System.out.println("Input Id");
                    String id = sc.nextLine();
                    System.out.println("Input name");
                    String name = sc.nextLine();
                    System.out.println("Input day of birth");
                    String dateOfBirth = sc.nextLine();
                    System.out.println("Input gender");
                    String gender = sc.nextLine();
                    System.out.println("Input Id Code");
                    String idCode = sc.nextLine();
                    System.out.println("Input phone number");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Input email");
                    String email = sc.nextLine();
                    System.out.println("Input address");
                    String address = sc.nextLine();
                    System.out.println("Input type of guest");
                    String typeOfGuest = sc.nextLine();
                    customerService.add(new Customer(id, name, dateOfBirth, gender, idCode, phoneNumber, email, address, typeOfGuest));
                    break;
                case 3:
                    System.out.println("Input id change");
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
                                "9. Return main menu\n" +
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
                                customer.setName(newName);
                                customerService.edit(customer);
                                break;
                            case 2:
                                System.out.println("Input day of birth");
                                String newDayOfBirth = sc.nextLine();
                                customer.setDayOfBirth(newDayOfBirth);
                                customerService.edit(customer);
                                break;
                            case 3:
                                System.out.println("Input gender");
                                String newGender = sc.nextLine();
                                customer.setGender(newGender);
                                customerService.edit(customer);
                                break;
                            case 4:
                                System.out.println("Input id code");
                                String newIdCode = sc.nextLine();
                                customer.setIdCode(newIdCode);
                                customerService.edit(customer);
                                break;
                            case 5:
                                System.out.println("Input phone number");
                                String newPhoneNumber = sc.nextLine();
                                customer.setPhoneNumber(newPhoneNumber);
                                customerService.edit(customer);
                                break;
                            case 6:
                                System.out.println("Input email");
                                String newEmail = sc.nextLine();
                                customer.setEmail(newEmail);
                                customerService.edit(customer);
                                break;
                            case 7:
                                System.out.println("Input address");
                                String newAddress = sc.nextLine();
                                customer.setAddress(newAddress);
                                customerService.edit(customer);
                                break;
                            case 8:
                                System.out.println("Input type of Guest");
                                String newTypeOfGuest = sc.nextLine();
                                customer.setTypeOfGuest(newTypeOfGuest);
                                customerService.edit(customer);
                                break;
                            case 9:
                                displayMainMenuCustomer();
                                break;
                            default:
                                System.out.println("Please input choice in menu");
                        }
                    } else {
                        System.out.println("Not existed");
                    }
                    break;
                case 5:
                    return customerService;
                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }
}
