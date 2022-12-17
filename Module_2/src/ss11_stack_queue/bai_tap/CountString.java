package ss11_stack_queue.bai_tap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> stringIntegerMap = new TreeMap<>();
        System.out.println("Nhập vào một chuỗi");
        String str = sc.nextLine();
        String strLowerCase = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (stringIntegerMap.containsKey(strLowerCase.charAt(i) + "")) {
                stringIntegerMap.put(strLowerCase.charAt(i) + "", stringIntegerMap.get(strLowerCase.charAt(i) + "") + 1);
            } else {
                stringIntegerMap.put(strLowerCase.charAt(i) + "", 1);
            }
        }
        System.out.println("Số lần xuất hiện của các từ trong chuỗi:" + stringIntegerMap);
    }
}


