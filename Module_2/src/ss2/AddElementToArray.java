package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài");
        int length1 = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length1 + 1];

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Nhập vào phần tử thứ" + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Nhập vào số X cần chèn ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào vị trí cần chèn ");
        int index = Integer.parseInt(sc.nextLine());
        if (index > -1 && index <= arr.length - 2) {
            for (int j = length1; j > index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = x;

            System.out.println("Mảng sau khi chèn là:");

            System.out.print(Arrays.toString(arr));

        } else {
            System.out.println("Không chèn được phần tử vào mảng");
        }
    }
}
