package ss2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numa;
        System.out.println("Nhập vào số a");
        numa = Integer.parseInt(sc.nextLine());
        int numb;
        System.out.println("Nhập vào số b");
        numb = Integer.parseInt(sc.nextLine());
        int sum = numa + numb;
        System.out.println(sum);

    }
}
