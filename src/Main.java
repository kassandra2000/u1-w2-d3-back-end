import entities.Customer;
import entities.Order;
import entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Customer> customersList = new ArrayList<>();
    static List<Order> ordersList = new ArrayList<>();
    static List<Product> productsList = new ArrayList<>();
    public static void main(String[] args) {
        createCustomers();
        createProducts();
        createOrders();

        System.out.println("----------------------------------esercizio 1------------------------------------");
        System.out.println(books());
        System.out.println("----------------------------------esercizio 2------------------------------------");
        System.out.println(babyOrder());
        System.out.println("----------------------------------esercizio 3------------------------------------");
        System.out.println(boys());
        System.out.println("----------------------------------esercizio 4------------------------------------");
        System.out.println(tierOrder());
    }

    public static void createCustomers() {
        Customer customer1 = new Customer("Aldo", 2);
        Customer customer2 = new Customer("Giovanni", 1);
        Customer customer3 = new Customer("Giacomo", 3);
        Customer customer4 = new Customer("Sonia", 4);

        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);
        customersList.add(customer4);
    }

    public static void createProducts() {
        Product product1 = new Product("sacco da box", "boys", 550.00);
        Product product2 = new Product("tablet", "elettronica", 250.00);
        Product product3 = new Product("telefono", "baby", 72.00);
        Product product4 = new Product("barbie", "baby", 45.99);
        Product product5 = new Product("IT", "Books", 12.90);
        Product product6 = new Product("Da Vinci's Code", "Books", 22.89);

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);
        productsList.add(product6);


    }

    public static void createOrders() {
        Order order1 = new Order(customersList.get(1));
        Order order2 = new Order(customersList.get(3));
        Order order3 = new Order(customersList.get(0));
        Order order4 = new Order(customersList.get(2));

        order1.addProduct(productsList.get(0));
        order1.addProduct(productsList.get(1));
        order1.addProduct(productsList.get(5));
        order1.addProduct(productsList.get(4));

        order2.addProduct(productsList.get(3));
        order2.addProduct(productsList.get(5));

        order3.addProduct(productsList.get(4));

        order4.addProduct(productsList.get(0));

        ordersList.add(order1);
        ordersList.add(order2);
        ordersList.add(order3);
        ordersList.add(order4);
    }

    //esercizio1
    public static List<Product> books() {
        return productsList.stream().filter(book -> book.getCategory().equals("Books") && book.getPrice() < 100).toList();

    }

    //esercizio2
    public static List<Order> babyOrder() {
        return ordersList.stream().filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("baby"))).toList();
    }

    //esercizio3
    public static List<Product> boys() {
        return productsList.stream().filter(product -> product.getCategory().equals("boys")).map(product ->
        {
            product.setPrice(product.getPrice() * 0.90);
            return product;
        }).toList();
    }

    //esercizio4
    public static List<Product> tierOrder() {
        List<Order> ordersArray = ordersList.stream().filter(order -> order.getCustomers().getTier().equals(2) && order.getOrderDate().isBefore(LocalDate.parse("2024-07-09")) && order.getOrderDate().isAfter(LocalDate.parse("2022-08-09"))).toList();
        List<Product> products = new ArrayList<>();
        for (Order order : ordersArray) {
            products.addAll(order.getProducts());
        }
        return products;
    }

    ;

}

