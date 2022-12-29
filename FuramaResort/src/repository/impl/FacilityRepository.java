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
        facilityIntegerMap.put(new Room("SVRO-0012","Big room", "60.0", "3000000", "6", "Day", "Breakfast"), 4);
        facilityIntegerMap.put(new Room("SVRO-1234","Twin beds", "40.0", "1000000", "4", "Month", "Clean the room"), 2);
        facilityMaintenanceMap.put(new Villa("SVVL-0234","Villa White", "200.0", "8000000", "8", "Day", "6", "50.0", "2"), 5);
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
