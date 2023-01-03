package ss12.mvc.bai_tap.arrayList_linkedList.linkedlist.repository;

import ss12.bai_tap.arrayList_linkedList.linkedlist.model.ProductLinked;

public interface IProductLinkedRepository {
    void addNewProduct(ProductLinked product);
    void updateProduct(int id,ProductLinked product);
    ProductLinked findProduct(int id);
    void removeProduct(int id);
    void listProduct();
    void searchProduct(String name);
    void sortAscendingOrder();
    void sortDescendingOrder();
}
