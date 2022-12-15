package ss11_stack_queue.bai_tap.invert_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackArr = new Stack<>();
        System.out.println("Nhập vào độ dài mảng");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ" + i);
            arr[i] = Integer.parseInt(sc.nextLine());
            stackArr.push(arr[i]);
        }
        System.out.println("Mảng nhập vào là:" + stackArr);
        int[] arr1 = new int[stackArr.size()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = stackArr.pop();
        }
        System.out.println("Mảng đảo ngược là:" + Arrays.toString(arr1));
    }
}
