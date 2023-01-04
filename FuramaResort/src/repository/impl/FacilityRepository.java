package repository.impl;

import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import repository.IFacilityRepository;
import utils.ReadAndWriteRoom;
import utils.ReadAndWriteVilla;

import javax.xml.ws.Service;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
//    static Map<Facility, Integer> facilityIntegerRoom = new LinkedHashMap<>();
//    static Map<Facility, Integer> facilityIntegerVilla = new LinkedHashMap<>();

//    static {
//        facilityIntegerRoom.put(new Room("SVRO-0012", "Big room", "60.0", "3000000", "6", "Day", "Breakfast"), 4);
//        facilityIntegerRoom.put(new Room("SVRO-1234", "Twin beds", "40.0", "1000000", "4", "Month", "Clean the room"), 2);
//        facilityIntegerVilla.put(new Villa("SVVL-0234", "Villa White", "200.0", "8000000", "8", "Day", "6", "50.0", "2"), 5);
//        ReadAndWriteRoom.writeFile(facilityIntegerRoom);
//        ReadAndWriteVilla.writeFile(facilityIntegerVilla);
//    }


    @Override
    public void display() {
        Map<Facility, Integer> facilityIntegerRoom = ReadAndWriteRoom.readFile();
        Map<Facility, Integer> facilityIntegerVilla = ReadAndWriteVilla.readFile();
        for (Map.Entry<Facility, Integer> entry : facilityIntegerRoom.entrySet()) {
            System.out.println(entry.getKey() + " number of uses: "+ entry.getValue());
        }
        for (Map.Entry<Facility, Integer> entry : facilityIntegerVilla.entrySet()) {
            System.out.println(entry.getKey() + " number of uses: " + entry.getValue());
        }
    }

    @Override
    public void addRoom(Facility room, int numberOfUses) {
        Map<Facility, Integer> facilityIntegerRoom = new LinkedHashMap<>();
        facilityIntegerRoom.put(room, numberOfUses);
        ReadAndWriteRoom.writeFile(facilityIntegerRoom);
    }

    @Override
    public void addVilla(Facility villa, int numberOfUses) {
        Map<Facility, Integer> facilityIntegerVilla = new LinkedHashMap<>();
        facilityIntegerVilla.put(villa, numberOfUses);
        ReadAndWriteVilla.writeFile(facilityIntegerVilla);
    }

    @Override
    public void displayListFacilityMaintenance() {
        Map<Facility, Integer>facilityIntegerRoom = ReadAndWriteRoom.readFile();
        Map<Facility, Integer> facilityIntegerVilla = ReadAndWriteVilla.readFile();
        for (Map.Entry<Facility, Integer> entry : facilityIntegerRoom.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + "number of uses:" + entry.getValue());
            }

        }
        for (Map.Entry<Facility, Integer> entry : facilityIntegerVilla.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + "number of uses:" + entry.getValue());
            }
        }
    }
}
