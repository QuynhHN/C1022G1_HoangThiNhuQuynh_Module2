package controllers;

import java.util.Scanner;

public class CustomerManagement {
    public void displayMainMenuCustomer() {
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Display list customers\n" +
                    "2. Add new customers\n" +
                    "3. Delete customers\n " +
                    "4. Edit customers\n" +
                    "5. Return main menu\n"+
                    "-----------------\n" +
                    "Input your choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    break;
                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }
}
