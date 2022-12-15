package ss11_stack_queue.bai_tap.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackStr = new Stack<>();
        Queue<String> queueStr = new LinkedList<>();
        System.out.println("Nhập vào một chuỗi");
        String str = sc.nextLine();
        String strLowerCase = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            stackStr.push(strLowerCase.charAt(i) + "");
            queueStr.offer(strLowerCase.charAt(i) + "");
        }
        System.out.println(stackStr);
        System.out.println(queueStr);
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            String stackChar = stackStr.pop();
            String queueChar = queueStr.poll();
            if (!stackChar.equals(queueChar)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Đó là chuỗi Palindrome");
        } else {
            System.out.println("Đó không là chuỗi Palindrome");
        }

    }
}
