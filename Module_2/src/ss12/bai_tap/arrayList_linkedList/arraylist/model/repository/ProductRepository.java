package ss12.bai_tap.arrayList_linkedList.arraylist.model.repository;

import ss12.bai_tap.arrayList_linkedList.arraylist.model.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Táo", 10000));
        productList.add(new Product(2, "Cam", 20000));
        productList.add(new Product(3, "Ổi", 15000));
    }

    @Override
    public void addNewProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                break;
            }
        }
    }

    @Override
    public Product findProduct(int id) {
        for (Product p : productList) {
            if (Objects.equals(p.getId(), id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void removeProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            productList.remove(productList.get(i));
        }
    }

    @Override
    public void listProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct(String name) {
        for (Product product : productList) {
//            if (product.getName().equals(name)) {
//                System.out.println(product);
//            }
            if (product.getName().contains(name)) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void sortAscendingOrder() {
        Collections.sort(productList);
    }

    @Override
    public void sortDescendingOrder() {
        Collections.sort(productList);
        Collections.reverse(productList);
    }

}
