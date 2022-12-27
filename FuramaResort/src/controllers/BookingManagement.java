package controllers;

import java.util.Scanner;

public class BookingManagement {
    public void displayMainMenuBooking() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Return main menu\n " +
                    "-----------------\n" +
                    "Input your choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:

                    break;
                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }
}
