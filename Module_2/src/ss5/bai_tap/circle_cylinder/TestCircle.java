package ss5.bai_tap.circle_cylinder;

import ss5.bai_tap.circle_cylinder.Circle;

import java.util.Scanner;

public class TestCircle {
    private static String color;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius:");
        double radius = Integer.parseInt(sc.nextLine());
        Circle circle = new Circle(radius, color);
        System.out.println("Radius:" + circle.getRadius());
        System.out.println("Area:" + circle.getArea());
    }
}
