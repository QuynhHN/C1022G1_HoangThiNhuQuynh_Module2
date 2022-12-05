package ss1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD");
        double usd;
        usd = scanner.nextDouble();
        double rate = usd * 23000;
        System.out.println("Giá trị quy đổi: " + rate + " VND");
    }
}
