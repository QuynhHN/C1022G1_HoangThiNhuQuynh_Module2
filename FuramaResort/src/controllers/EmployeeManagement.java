package controllers;

import java.util.Scanner;

public class EmployeeManagement {
    public void displayMainMenu() {
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Delete employee\n " +
                    "4. Edit employee\n" +
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
