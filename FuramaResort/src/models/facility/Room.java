package models.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceName, String name, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType, String freeService) {
        super(serviceName, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                ", freeService='" + freeService + '\'' +
                "} ";
    }
}
