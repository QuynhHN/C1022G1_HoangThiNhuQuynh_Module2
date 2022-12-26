package ss17.bai_tap.product;

import ss17.bai_tap.product.model.Product;

import java.io.*;
import java.util.List;

public class ReadAndWriteProduct {
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
}
