package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class TotalDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cột");
        int length = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Nhập vào phần tử thứ [" + i + "," + j + "]");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mảng vừa nhập");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng các số ở đường chéo chính: " +sum);

    }
}
