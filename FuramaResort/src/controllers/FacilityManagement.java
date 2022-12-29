package controllers;

import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import services.IFacilityService;
import services.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    public Object displayMainMenuFacility() {
        IFacilityService facilityService = new FacilityService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n" +
                    "-----------------\n" +
                    "Input your choice");
            int choiceFacility = Integer.parseInt(sc.nextLine());
            switch (choiceFacility) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    System.out.println("------Menu new Facility----\n" +
                            "1. Add New Villa\n" +
                            "2. Add New Room\n" +
                            "3. Back to menu\n" +
                            "-----------------\n" +
                            "Input your choice");
                    int choiceNewFacility = Integer.parseInt(sc.nextLine());
                    switch (choiceNewFacility) {
                        case 1:
                            System.out.println("Input new name service");
                            String newName = sc.nextLine();
                            System.out.println("Input new usable area");
                            String newUsableArea = sc.nextLine();
                            System.out.println(" Input rental costs");
                            String newRentalCosts = sc.nextLine();
                            System.out.println("Input maximum number of people");
                            String newMaximumNumberOfPeople = sc.nextLine();
                            System.out.println("Input rental type");
                            String newRentalType = sc.nextLine();
                            System.out.println("Input room standard");
                            String newRoomStandard = sc.nextLine();
                            System.out.println("Input pool area");
                            String newPoolArea = sc.nextLine();
                            System.out.println("Input number of floors");
                            String newNumberOfFloors = sc.nextLine();
                            System.out.println("Input number of use");
                            int numberOfUses = Integer.parseInt(sc.nextLine());
                            Facility villa = new Villa(newName, newUsableArea, newRentalCosts, newMaximumNumberOfPeople, newRentalType, newRoomStandard, newPoolArea, newNumberOfFloors);
                            facilityService.add(villa, numberOfUses);
                            break;
                        case 2:
                            System.out.println("Input new name service");
                            String newNameRoom = sc.nextLine();
                            System.out.println("Input new usable area");
                            String newUsableAreaRoom = sc.nextLine();
                            System.out.println(" Input rental costs");
                            String newRentalCostsRoom = sc.nextLine();
                            System.out.println("Input maximum number of people");
                            String newMaximumNumberOfPeopleRoom = sc.nextLine();
                            System.out.println("Input rental type");
                            String newRentalTypeRoom = sc.nextLine();
                            System.out.println("Input free service");
                            String newFreeServiceRoom = sc.nextLine();
                            System.out.println("Input number of use");
                            int numberOfUsesRoom = Integer.parseInt(sc.nextLine());
                            Facility room = new Room(newNameRoom, newUsableAreaRoom, newRentalCostsRoom, newMaximumNumberOfPeopleRoom, newRentalTypeRoom, newFreeServiceRoom);
                            facilityService.add(room, numberOfUsesRoom);
                            break;
                        case 3:
                            displayMainMenuFacility();
                            break;
                        default:
                            System.out.println("Please input choice in menu");
                    }
                case 3:
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                    return facilityService;
                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }
}
