package models.person;

public class Employee extends Person{

    private String id;
    private String academicLevel;
    private String position;
    private String salary;
    private String gender;


    public Employee(String id, String name, String dayOfBirth, String gender, String idCode, String phoneNumber, String email) {
        super(name, dayOfBirth, gender, idCode, phoneNumber, email);
        this.id = this.id;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
        this.gender = gender;
//        boolean f=female;
//        boolean m= male;
//        if( gender = f){
//            System.out.println("female");
//        }else {
//            System.out.println("male");
//        }

    }

    public Employee( String id, String academicLevel, String position, String salary, String gender) {
        this.id = id;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
        this.gender = gender;
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
    public String isGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", gender=" + gender +
                '}';
    }
}
