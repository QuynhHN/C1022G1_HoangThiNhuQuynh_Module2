package string_and_regex.bai_tap;

import java.util.Scanner;

public class ClassName {
    private static final String REGEX_NAME = "^[CAP]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp học");
        String str = sc.nextLine();
//        System.out.println(str.matches(ClassName.REGEX_NAME));
        if (str.matches(ClassName.REGEX_NAME)) {
            System.out.println("Tên lớp hợp lệ");
        } else {
            System.out.println("Tên lớp không hợp lệ");
        }
    }


}
