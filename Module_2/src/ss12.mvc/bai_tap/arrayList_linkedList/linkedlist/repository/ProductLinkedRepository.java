package ss12.bai_tap.arrayList_linkedList.linkedlist.repository;

import ss12.bai_tap.arrayList_linkedList.linkedlist.model.ProductLinked;

import java.util.LinkedList;
import java.util.List;

public class ProductLinkedRepository implements IProductLinkedRepository {
    private static List<ProductLinked> productLinkeds = new LinkedList<>();
    static {
        productLinkeds.add(new ProductLinked(1, "Táo", 10000));
        productLinkeds.add(new ProductLinked(2, "Cam", 20000));
        productLinkeds.add(new ProductLinked(3, "Ổi", 15000));
    }

    @Override
    public void addNewProduct(ProductLinked product) {

    }

    @Override
    public void updateProduct(int id, ProductLinked product) {

    }

    @Override
    public ProductLinked findProduct(int id) {
        return null;
    }

    @Override
    public void removeProduct(int id) {

    }

    @Override
    public void listProduct() {

    }

    @Override
    public void searchProduct(String name) {

    }

    @Override
    public void sortAscendingOrder() {

    }

    @Override
    public void sortDescendingOrder() {

    }
}
