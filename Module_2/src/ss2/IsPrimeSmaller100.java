package ss2;

import java.util.Scanner;

public class IsPrimeSmaller100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = 2;
        while (prime < 100) {
            int count = 0;
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(prime);
            }
            prime++;
        }
    }
}
