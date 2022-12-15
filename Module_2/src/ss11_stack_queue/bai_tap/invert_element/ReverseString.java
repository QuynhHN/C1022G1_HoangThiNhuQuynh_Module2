package ss11_stack_queue.bai_tap.invert_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackString = new Stack<>();
        System.out.println("Nhập vào chuỗi:");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stackString.push(str.charAt(i) + "");
        }
        System.out.println("Chuỗi đảo ngược:");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stackString.pop());
        }
    }
}
