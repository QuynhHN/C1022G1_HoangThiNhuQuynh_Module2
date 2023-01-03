package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class DemoDeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the index [" + i + "]");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the X:");
        int x = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (x == arr[i]) {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = 0;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
