package ss15.iiiegal_triangle_exception;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleException triangleException = new TriangleException();
        System.out.println("Nhập vào các cạnh a, b, c:");
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        triangleException.checkTriangle(a, b, c);
    }

    public void checkTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            try {
                throw new IllegalTriangleException("Lỗi: cạnh tam giác phải dương ");
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            try {
                throw new IllegalTriangleException("Lỗi: Tổng 2 cạnh phải lớn hơn cạnh còn lại");
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Cạnh của tam giác");
        }


//        try {
//            Scanner sc = new Scanner(System.in);
//            TriangleException triangleException = new TriangleException();
//            System.out.println("Nhập vào các cạnh a, b, c:");
//            double a = Double.parseDouble(sc.nextLine());
//            double b = Double.parseDouble(sc.nextLine());
//            double c = Double.parseDouble(sc.nextLine());
//            if (a >= 0 && b >= 0 && c >= 0 && a + b > c && a + c > b && b + c > a) {
//                System.out.println("Nó là cạnh tam giác");
//            } else {
//                throw new IllegalTriangleException("IllegalTriangleException Exception");
//            }
//        } catch (IllegalTriangleException exception) {
//            System.out.println("IllegalTriangleException Exception");
//        }
    }
}