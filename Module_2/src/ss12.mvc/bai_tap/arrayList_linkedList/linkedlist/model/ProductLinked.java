package ss12.bai_tap.arrayList_linkedList.linkedlist.model;

public class ProductLinked implements Comparable<ProductLinked>{
    private int id;
    private double price;
    private String name;

    public ProductLinked(int id, String name, double price) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductLinked{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(ProductLinked o) {
        return this.id - o.getId();
    }
}
