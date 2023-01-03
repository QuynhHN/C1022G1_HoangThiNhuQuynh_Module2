package ss12.bai_tap.arrayList_linkedList.arraylist.model.service;

import ss12.bai_tap.arrayList_linkedList.arraylist.model.model.Product;
import ss12.bai_tap.arrayList_linkedList.arraylist.model.repository.IProductRepository;
import ss12.bai_tap.arrayList_linkedList.arraylist.model.repository.ProductRepository;

public class ProductService implements IProductService {
    IProductRepository repository = new ProductRepository();

    @Override
    public void addNewProduct(Product product) {
    }

    @Override
    public void updateProduct(Product product) {
    }

    @Override
    public Product findProductById(int id) {
        return repository.findProduct(id);
    }

    @Override
    public void removeProduct(int id) {
        repository.removeProduct(id);
    }

    @Override
    public void listProduct() {
        repository.listProduct();
    }

    @Override
    public void searchProduct(String name) {
        repository.searchProduct(name);
    }

    @Override
    public void sortAscendingOrder() {
        repository.sortAscendingOrder();
    }

    @Override
    public void sortDescendingOrder() {
        repository.sortDescendingOrder();
    }


}
