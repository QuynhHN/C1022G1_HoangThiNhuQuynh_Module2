package ss13.thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUseRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập vào giá trị cần tìm");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println("Giá trị cần tìm nằm ở vị trí thứ: \n" + binarySearch(arr, 0, arr.length - 1, value));
    }

    private static int binarySearch(int[] arr, int left, int right, int value) {
        int mid = 0;
        if (left <= right) {
            mid = (left + right) / 2;
        }
        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] > value) {
            return binarySearch(arr, mid - 1, right, value);
        } else if (arr[mid]<value) {
            return binarySearch(arr, mid + 1, right, value);
        } else return left - 1;
    }

}


