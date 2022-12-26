package models.person;

public class Employee extends Person{

    private int id;
    private String academicLevel;
    private String position;
    private String salary;
    private boolean gender;

    public Employee(String name, String dayOfBirth, boolean gender, String idCode, String phoneNumber, String email) {
        super(name, dayOfBirth, gender, idCode, phoneNumber, email);
    }
    
}
