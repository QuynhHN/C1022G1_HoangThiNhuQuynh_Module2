package ss4.bai_tap.student;

import ss4.bai_tap.student.Student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Quynh");
//        student.setClasses("C1022G1");
//        System.out.println("Name: " + student.getName());
//        System.out.println("Classes: " + student.getClasses());

        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Input name");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("Input classes ");
        String classes = sc.nextLine();
        student.setClasses(classes);

        System.out.println("Name: " + student.getName());
        System.out.println("Classes: " + student.getClasses());
    }

}
