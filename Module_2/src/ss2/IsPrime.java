package ss2;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int checkCount = 0;
        int count = 0;
        while (count < 20) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    checkCount++;
                }
            }
            if (checkCount == 2) {
                count++;
                System.out.println(num);
            }
            checkCount=0;
            num++;
        }
    }
}
