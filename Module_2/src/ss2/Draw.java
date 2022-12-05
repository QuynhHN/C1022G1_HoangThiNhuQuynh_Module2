package ss2;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        int number = Integer.parseInt(sc.nextLine());
        switch (number) {
            case 1:
                int length = 6;
                int width = 3;
                for (int i = 1; i <= width; i++) {
                    for (int j = 1; j <= length; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                int height;
                System.out.println("Nhập vào chiều cao của tam giác: ");
                height = sc.nextInt();
                for (int i = 1; i <= height; ++i) {
                    for (int j = 1; j <= i; ++j) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                System.out.println("\n");
                break;
            case 3:
                int heght;
                System.out.println("Nhập vào chiều cao của tam giác");
                heght = sc.nextInt();
                for (int i = heght; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("\n");
                break;
        }
    }
}

