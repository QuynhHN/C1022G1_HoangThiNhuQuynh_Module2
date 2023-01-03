package ss12.bai_tap.arrayList_linkedList.arraylist.model.repository;

import ss12.bai_tap.arrayList_linkedList.arraylist.model.model.Product;

public interface IProductRepository {
    void addNewProduct(Product product);
    void updateProduct( Product product);
    Product findProduct(int id);
    void removeProduct(int id);
    void listProduct();
    void searchProduct(String name);
    void sortAscendingOrder();
    void sortDescendingOrder();

}
