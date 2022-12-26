package controllers;

import models.facility.Facility;
import services.IFacilityService;
import services.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    public void displayMainMenuFacility() {
        IFacilityService facilityService= new FacilityService();
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n " +
                    "4. Return main menu\n"+
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
