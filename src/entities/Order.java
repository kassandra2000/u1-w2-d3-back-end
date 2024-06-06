package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

    private final Random rdm = new Random();
    private long id = rdm.nextLong(10000, 99999999);
    private String status;
    private LocalDate orderDate;
    private final LocalDate deliveryDate;
    private List<Product> products;
    private Customer customers;

    //costruttore

    public Order(Customer customers) {
        this.status = "in corso...";
        this.orderDate = LocalDate.now();
        this.deliveryDate = LocalDate.now().plusDays(4);
        this.products = new ArrayList<>();
        this.customers = customers;
    }

    //metodi

    public void addProduct(Product prod) {
        products.add(prod);
    }



    //to string

    @Override
    public String toString() {
        return "Order{" +
                "rdm=" + rdm +
                ", id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customers=" + customers +
                '}';
    }

    //getter e setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }
}
