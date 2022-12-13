package ss6.bai_tap.colorable;

import java.util.Scanner;

public class TestSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input edge");
        double edge= Double.parseDouble(sc.nextLine());
        Square square= new Square("white",true,edge);
        System.out.println("Area:"+ square.getArea());

    }
}
