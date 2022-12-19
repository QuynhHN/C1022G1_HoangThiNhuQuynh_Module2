package ss12.bai_tap.arrayList_linkedList.arraylist.controller;

import ss12.bai_tap.arrayList_linkedList.arraylist.model.model.Product;
import ss12.bai_tap.arrayList_linkedList.arraylist.model.service.IProductService;
import ss12.bai_tap.arrayList_linkedList.arraylist.model.service.ProductService;

import java.util.Scanner;

public class ProductManagerController {
    public static final IProductService productManagerService = new ProductService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("--------------------Menu----------------------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("8.Thoát");
            System.out.println("Nhập vào lựa chọn của bạn ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Nhập id ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm ");
                    double price = Double.parseDouble(sc.nextLine());
                    productManagerService.addNewProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.println("Nhập vào id sản phẩm cần sửa");
                    int idFix = Integer.parseInt(sc.nextLine());
                    Product p = productManagerService.findProductById(idFix);
                    if (p != null) {
                        System.out.println("Nhập vào tên mới của sản phẩm");
                        String newName = sc.nextLine();
                        p.setName(newName);
                        System.out.println("Nhập vào giá mới của sản phẩm");
                        double newPrice = Double.parseDouble(sc.nextLine());
                        p.setPrice(newPrice);
                        productManagerService.updateProduct(p);
                    } else {
                        System.out.println("Không tồn tại");
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào id sản phẩm cần xóa");
                    id = Integer.parseInt(sc.nextLine());
                    productManagerService.removeProduct(id);
                    break;
                case 4:
                    productManagerService.listProduct();
                    break;
                case 5:
                    System.out.println("Nhập vào tên sản phẩm cần tìm");
                    name = sc.nextLine();
                    productManagerService.searchProduct(name);
                    break;
                case 6:
                    productManagerService.sortAscendingOrder();
                    break;
                case 7:
                    productManagerService.sortDescendingOrder();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
            
        } while (true);
    }
}

