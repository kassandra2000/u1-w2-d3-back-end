package entities;

import java.util.Random;

public class Product {
    private Random rdm = new Random();
    private long id = rdm.nextLong(10000, 99999999);
    private String name;
    private String category;
    private Double price;

    //costruttore
    public Product(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    //to string
    @Override
    public String toString() {
        return "Product{" +
                "rdm=" + rdm +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    //getter e setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Random getRdm() {
        return rdm;
    }

    public void setRdm(Random rdm) {
        this.rdm = rdm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
