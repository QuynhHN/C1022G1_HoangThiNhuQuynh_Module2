import java.sql.SQLOutput;
import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD");
        double usd = 23000;
        double vnd;
        usd = scanner.nextDouble();
        double rate = usd * 23000;
        System.out.println("Giá trị quy đổi: " + rate + " VND");
    }
}
