package services.impl;

import models.facility.Facility;
import repository.IFacilityRepository;
import repository.impl.FacilityRepository;
import services.IFacilityService;

public class FacilityService implements IFacilityService {
    IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        facilityRepository.display();
    }

    @Override
    public void addRoom(Facility room, int numberOfUses) {
        facilityRepository.addRoom(room, numberOfUses);
    }

    @Override
    public void addVilla(Facility villa, int numberOfUses) {
        facilityRepository.addVilla(villa, numberOfUses);
    }

    @Override
    public void displayListFacilityMaintenance() {
        facilityRepository.displayListFacilityMaintenance();
    }
}
