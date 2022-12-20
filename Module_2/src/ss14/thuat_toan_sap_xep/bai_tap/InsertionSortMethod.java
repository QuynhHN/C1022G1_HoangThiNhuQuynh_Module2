package ss14.thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng nhập vào ban đầu:\n" + Arrays.toString(arr));
        InsertionSortMethod insertionSortMethod = new InsertionSortMethod();
        insertionSortMethod.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:\n" + Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            int k = i - 1;
            for (; k >= 0 && arr[k] > currentElement; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
        }
    }
}