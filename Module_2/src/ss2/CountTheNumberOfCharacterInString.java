package ss2;

import java.util.Scanner;

public class CountTheNumberOfCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String str = sc.nextLine();
        System.out.println("Nhập vào ký tự:");
        char character = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }

        }
        System.out.println("Số lần xuất hiện ký tự trong chuỗi:" + count);
    }
}
