package ss2;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột");
        int column = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập vào phần tử thứ [" + i + "," + j + "]");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mảng vừa nhập");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        int sum = 0;
        int colCalculate;
        do {
            System.out.println("Nhập vào số cột cần tính");
            colCalculate = Integer.parseInt(sc.nextLine());
        } while (colCalculate < 0 || colCalculate > column - 1);


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][colCalculate];
        }
        System.out.println("Tổng các phần tử trong một mảng:" + sum);


    }
}

