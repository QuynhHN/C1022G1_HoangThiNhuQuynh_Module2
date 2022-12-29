package repository;

import models.facility.Facility;

public interface IFacilityRepository {
    void display();

    void add(Facility facility, int numberOfUses);

    void displayListFacilityMaintenance();
}
