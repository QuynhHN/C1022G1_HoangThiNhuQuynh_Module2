package ss5.bai_tap.point2D_point3D;

import java.util.Scanner;

public class TestPoint3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x:");
        float x = Integer.parseInt(sc.nextLine());
        System.out.println("Input y:");
        float y = Integer.parseInt(sc.nextLine());
        System.out.println("Input z");
        float z = Integer.parseInt(sc.nextLine());
        Point3D point3D = new Point3D(x, y, z);
        System.out.println(point3D);
    }
}
