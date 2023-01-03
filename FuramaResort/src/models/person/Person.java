package models.person;

public class Person {
    private String name;
    private String dayOfBirth;
    private String gender;
    private String idCode;
    private String phoneNumber;
    private String email;

    public Person(String name, String dayOfBirth, String gender, String idCode, String phoneNumber, String email) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCode = idCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public String toString() {
//        return
//               name +
//                "," + dayOfBirth +
//                "," + gender +
//                "," + idCode +
//                "," + phoneNumber +
//                "," + email;
//    }


    @Override
    public String toString() {
        return
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCode='" + idCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String convertLine(){
        String comma = ",";
        return this.name+comma+this.dayOfBirth+comma+this.gender+comma+this.idCode+comma+this.phoneNumber+comma+this.email;
    }
}
