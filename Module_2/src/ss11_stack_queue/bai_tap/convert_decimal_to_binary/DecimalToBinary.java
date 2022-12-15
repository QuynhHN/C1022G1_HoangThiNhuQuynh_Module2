package ss11_stack_queue.bai_tap.convert_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> stackSurplus = new Stack<>();
        System.out.println("Nhập vào số nguyên dương");
        int num= Integer.parseInt(sc.nextLine());
        while (num>0){
            int surplus = num%2;
            stackSurplus.push(surplus);
            num= num/2;
        }
        System.out.println("Hệ thập phân:");
        int temp= stackSurplus.size();
        for (int i = 0; i < temp ; i++) {
            System.out.print(stackSurplus.pop());
        }
    }
}
