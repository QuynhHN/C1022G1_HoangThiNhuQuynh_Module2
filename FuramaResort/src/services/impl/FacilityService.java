package services.impl;

import models.facility.Facility;
import repository.IFacilityRepository;
import repository.impl.FacilityRepository;
import services.IFacilityService;

import java.util.Map;

public class FacilityService implements IFacilityService {
    IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        facilityRepository.display();
    }

    @Override
    public void add(Facility facility, int numberOfUses) {
        facilityRepository.add(facility, numberOfUses);
    }

    @Override
    public void displayListFacilityMaintenance() {
        facilityRepository.displayListFacilityMaintenance();
    }
}
