package ss17.bai_tap.product.controller;

import ss17.bai_tap.product.model.Product;
import ss17.bai_tap.product.service.IProductService;
import ss17.bai_tap.product.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        do {
            System.out.println("------------Menu----------\n" +
                    "1. Thêm thông tin sản phẩm\n" +
                    "2. Hiển thị sản phẩm\n" +
                    "3. Tìm kiếm thông tin sản phẩm\n" +
                    "4. Exit\n" +
                    "-----------------\n" +
                    "Input your choice:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Input product id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Input product name");
                    String name = sc.nextLine();
                    System.out.println("Input product manufacturer");
                    String manufacturer = sc.nextLine();
                    System.out.println("Input product price");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.println("Input product color");
                    String color = sc.nextLine();
                    Product product = new Product(id, name, manufacturer, price, color);
                    productService.addNewProduct(product);
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    System.out.println("Nhập vào tên sản phẩm cần tìm");
                    name = sc.nextLine();
                    productService.searchProduct(name);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }
}
