package ss17.bai_tap.product.repository;

import ss17.bai_tap.product.model.Product;

public interface IProductRepository {
    void addNewProduct(Product product);

    Product findProduct(int id);

    void display();

    void searchProduct(String name);

}
