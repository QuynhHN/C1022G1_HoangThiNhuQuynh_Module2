package ss17.bai_tap.product.repository.impl;

import ss17.bai_tap.product.ReadAndWriteProduct;
import ss17.bai_tap.product.model.Product;
import ss17.bai_tap.product.repository.IProductRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepository implements IProductRepository {

    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Dell XPS", "Dell", 25000000, "white"));
        productList.add(new Product(2, "ASUS VivoBook", "Asus", 19000000, "silver"));
        productList.add(new Product(3, "Macbook Air M1", "Apple", 23000000, "black"));
        try {
            ReadAndWriteProduct.writeObjectList(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addNewProduct(Product product) {
        productList.add(product);
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
    public void display() {
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void searchProduct(String name) {
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                System.out.println(product);
            }
        }
    }
}
