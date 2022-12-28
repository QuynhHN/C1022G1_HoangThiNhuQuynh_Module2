package models.person;

public class Employee extends Person{

    private String id;
    private String academicLevel;
    private String position;
    private String salary;


    public Employee(String id,String name, String dayOfBirth, String gender, String idCode, String phoneNumber, String email,
                     String academicLevel, String position, String salary) {
        super(name, dayOfBirth, gender, idCode, phoneNumber, email);
        this.id = id;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                 super.toString() +
                ", academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "} " ;
    }
}
