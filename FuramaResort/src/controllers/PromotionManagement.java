package controllers;

import java.util.Scanner;

public class PromotionManagement {
    public void displayMainMenuPromotion() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
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
