package repository;

import models.facility.Facility;

public interface IFacilityRepository {
    void display();

    void addRoom(Facility room, int numberOfUses);

    void addVilla(Facility villa, int numberOfUses);

    void displayListFacilityMaintenance();
}
