package ss4.bai_tap.circle;

import ss4.bai_tap.circle.Circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
//        Circle circle=new Circle(4);
//        System.out.println("Radius is: "+ circle.getRadius() );
//        System.out.println("Area is: "+ circle.getArea());

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius");
        double r = Integer.parseInt(sc.nextLine());
        Circle circle = new Circle(r);
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
    }
}
