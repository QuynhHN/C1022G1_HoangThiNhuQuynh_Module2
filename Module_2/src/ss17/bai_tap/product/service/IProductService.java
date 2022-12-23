package ss17.bai_tap.product.service;

import ss17.bai_tap.product.model.Product;

public interface IProductService {
    void addNewProduct(Product product);

    Product findProduct(int id);

    void display();

    void searchProduct(String name);
}
