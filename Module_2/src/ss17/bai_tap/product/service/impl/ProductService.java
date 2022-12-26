package ss17.bai_tap.product.service.impl;

import ss17.bai_tap.product.model.Product;
import ss17.bai_tap.product.repository.IProductRepository;
import ss17.bai_tap.product.repository.impl.ProductRepository;
import ss17.bai_tap.product.service.IProductService;

public class ProductService implements IProductService {
    IProductRepository repository = new ProductRepository();

    @Override
    public void addNewProduct(Product product) {
        repository.addNewProduct(product);
    }

    @Override
    public Product findProduct(int id) {
        return repository.findProduct(id);
    }

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void searchProduct(String name) {
        repository.searchProduct(name);
    }
}
