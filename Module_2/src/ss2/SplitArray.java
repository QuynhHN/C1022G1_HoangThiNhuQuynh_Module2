package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        int even[] = new int[length];
        int odd[] = new int[length];
        int a =0;
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào vị trí thứ" + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[a] = arr[i];
                a++;
            } else {
                odd[b] = arr[i];
                b++;
            }
        }
        System.out.println("mảng chẵn:" + Arrays.toString(even));
        System.out.println("Mảng lẽ:" + Arrays.toString(odd));
    }
}
