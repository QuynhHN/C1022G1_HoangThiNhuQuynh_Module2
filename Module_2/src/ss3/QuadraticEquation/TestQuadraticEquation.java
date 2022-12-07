package ss3.QuadraticEquation;

import ss3.QuadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập b:");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập c:");
        int c = Integer.parseInt(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getA() == 0) {
            System.out.println("x=" + (-quadraticEquation.getC()) / quadraticEquation.getB());
        } else {
            if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phương trình có nghiệm kép x1=x2=" + (-quadraticEquation.getB()) / (2 * quadraticEquation.getA()));
            } else if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println("Phương trình có nghiệm x1=" + quadraticEquation.getRoot1());
                System.out.println("Phương trình có nghiệm x2=" + quadraticEquation.getRoot2());
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
