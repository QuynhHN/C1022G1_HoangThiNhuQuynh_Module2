package ss5.bai_tap.point2D_point3D;

import ss5.bai_tap.point2D_point3D.Point2D;

import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x: ");
        float x = Integer.parseInt(sc.nextLine());
        System.out.println("Input y:");
        float y = Integer.parseInt(sc.nextLine());
        Point2D point2D = new Point2D(x, y);
        System.out.println(point2D);
    }
}
