package ss6.bai_tap.resizeable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geometry[] geometrys = new Geometry[3];
        Geometry geometry1 = new Circle(4);
        Geometry geometry2 = new Rectangle(6, 3);
        Geometry geometry3 = new Square(6);

        geometrys[0] = geometry1;
        geometrys[1] = geometry2;
        geometrys[2] = geometry3;
        System.out.println("Nhập vào tỷ lệ phần trăm");
        double percent = Double.parseDouble(sc.nextLine());
        for (Geometry geometry : geometrys) {
            System.out.println("Diện tích trước khi tăng:" + geometry.getArea());
            if (geometry instanceof Circle) {
                Circle circle = (Circle) geometry;
                circle.resize(percent);
            } else if (geometry instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) geometry;
                rectangle.resize(percent);
            } else {
                Square square = (Square) geometry;
                square.resize(percent);
            }
        }
    }
}
