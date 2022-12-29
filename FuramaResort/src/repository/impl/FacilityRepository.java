package repository.impl;

import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import repository.IFacilityRepository;

import javax.xml.ws.Service;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Map<Facility, Integer> facilityMaintenanceMap = new LinkedHashMap<>();

    static {
        facilityIntegerMap.put(new Room("Big room", "60", "3000000", "6", "day", "Breakfast"), 4);
        facilityIntegerMap.put(new Room("Twin beds", "40", "1000000", "4", "day", "Clean the room"), 2);
        facilityMaintenanceMap.put(new Villa("Villa White", "200", "8000000", "8", "day", "6", "50.0", "2"), 5);
    }


    @Override
    public void display() {
        for (Facility facility : facilityIntegerMap.keySet()) {
            System.out.println(facility);
            System.out.println(facilityIntegerMap.get(facility));

        }
    }

    @Override
    public void add(Facility facility, int numberOfUses) {
        if (numberOfUses < 5) {
            facilityIntegerMap.put(facility, numberOfUses);
        } else {
            facilityMaintenanceMap.put(facility, numberOfUses);
        }

    }

    @Override
    public void displayListFacilityMaintenance() {
        for (Facility facility : facilityMaintenanceMap.keySet()) {
            System.out.println(facility);
            System.out.println(facilityMaintenanceMap.get(facility));
        }
    }
}
