package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] result = new int[array1.length + array2.length];
        int pos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các phàn tử mảng thứ nhất: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập vào các phàn tử mảng thứ hai: ");
        for (int j = 0; j < array1.length; j++) {
            array2[j] = Integer.parseInt(sc.nextLine());
        }
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) {
            result[pos] = element;
            pos++;
        }
        System.out.println("Mảng sau khi gộp là: " + Arrays.toString(result));

        System.out.println("\n");
    }
}

