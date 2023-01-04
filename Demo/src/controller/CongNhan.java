package controller;

import service.ICongNhanService;
import service.impl.CongNhanService;

import java.util.Scanner;

public class CongNhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CongNhanService congNhanService = new CongNhanService();
        do {
            System.out.println("----Menu-----\n" +
                    "1.Hiển thị\n" +
                    "2.Thêm\n" +
                    "3.Tìm kiếm"+
                    "4.Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    congNhanService.display();
                    break;
                case 2:
                    System.out.println("Nhập vào mã nhân viên");
                    String id = sc.nextLine();
                    System.out.println("Nhập vào tên");
                    String name = sc.nextLine();
                    System.out.println("Nhập vào email");
                    String email = sc.nextLine();
                    System.out.println("Nhập vào địa chỉ");
                    String address = sc.nextLine();
                    congNhanService.add(id, name, email, address);
                    break;
                case 3:
                    System.out.println("Nhập vào tên tìm kiếm");
                    String findName= sc.nextLine();



                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);
    }
}
