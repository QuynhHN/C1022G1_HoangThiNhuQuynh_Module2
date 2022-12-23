package ss17.bai_tap.product.repository.impl;

import ss17.bai_tap.product.model.Product;
import ss17.bai_tap.product.repository.IProductRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepository implements IProductRepository {
    private static final String FILE_PATH = "C:\\Users\\DELL\\Desktop\\CODEGYM\\module_2\\Module_2\\src\\ss17\\bai_tap\\product\\product.dat";

    public static void writeObjectList(List<Product> productList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(productList);
        oos.close();
    }

    public static List<Product> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Product> productList = (List<Product>) ois.readObject();
        return productList;

    }

    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Dell XPS", "Dell", 25000000, "white"));
        productList.add(new Product(2, "ASUS VivoBook", "Asus", 19000000, "silver"));
        productList.add(new Product(3, "Macbook Air M1", "Apple", 23000000, "black"));
        try {
            writeObjectList(productList);
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
