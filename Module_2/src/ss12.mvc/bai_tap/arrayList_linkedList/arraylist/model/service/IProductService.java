package ss12.bai_tap.arrayList_linkedList.arraylist.model.service;

import ss12.bai_tap.arrayList_linkedList.arraylist.model.model.Product;

public interface IProductService {
    void addNewProduct(Product product);

    void updateProduct(Product product);

    Product findProductById(int id);

    void removeProduct(int id);

    void listProduct();

    void searchProduct(String name);

    void sortAscendingOrder();

    void sortDescendingOrder();
}
