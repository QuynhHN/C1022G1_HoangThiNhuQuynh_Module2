package services;

import models.facility.Facility;

public interface IFacilityService {
    void display();

    void add(Facility facility, int numberOfUses);

    void displayListFacilityMaintenance();
}
