package string_and_regex.bai_tap;

import java.util.Scanner;

public class PhoneNumber {
    private static final String REGEX_NUMBER="^[(]\\d{2}[)][-][(]0\\d{9}[)]$";

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại");
        String str= sc.nextLine();
        if(str.matches(PhoneNumber.REGEX_NUMBER)){
            System.out.println("Số điện thoại hợp lệ");
        }else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
