package services;

import models.facility.Facility;

public interface IFacilityService {
    void display();

    void addRoom(Facility room, int numberOfUses);

    void addVilla(Facility villa, int numberOfUses);


    void displayListFacilityMaintenance();
}
