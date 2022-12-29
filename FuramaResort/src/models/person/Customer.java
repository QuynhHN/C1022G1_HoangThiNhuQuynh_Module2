package models.person;

public class Customer extends Person {
    private String id;
    private String address;
    private String typeOfGuest;

    public Customer() {
    }

    public Customer(String id, String name, String dayOfBirth, String gender, String idCode, String phoneNumber, String email, String address, String typeOfGuest) {
        super(name, dayOfBirth, gender, idCode, phoneNumber, email);
        this.id = id;
        this.address = address;
        this.typeOfGuest = typeOfGuest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                super.toString() +
                ", address='" + address + '\'' +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                "} ";
    }
}