package ss5.bai_tap.circle_cylinder;

import ss5.bai_tap.circle_cylinder.Cylinder;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height");
        double height = Integer.parseInt(sc.nextLine());
        System.out.println("Input radius");
        double radius = Integer.parseInt(sc.nextLine());

        Cylinder cylinder = new Cylinder(radius, "blue", height);
        System.out.println("Height:" + cylinder.getHeight());
        System.out.println("Volume:" + cylinder.getVolume());
    }
}
