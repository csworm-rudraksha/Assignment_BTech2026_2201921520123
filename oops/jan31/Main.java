package oops.jan31;

import java.util.*;

// Product Class
class Product {
    private String productName;
    private double price;
    private int stock;

    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        if (quantity > 0 && stock >= quantity) {
            stock -= quantity;
        } else {
            System.out.println("Insufficient stock for " + productName);
        }
    }

    public boolean isInStock() {
        return stock > 0;
    }
}

// Order Class
class Order {
    private static int idCounter = 1;
    private int orderID;
    private List<Product> products;
    private String status;

    public Order() {
        this.orderID = idCounter++;
        this.products = new ArrayList<>();
        this.status = "Pending";
    }

    public int getOrderID() {
        return orderID;
    }

    public void addProduct(Product p) {
        if (p.isInStock()) {
            products.add(p);
            p.updateStock(1);
        } else {
            System.out.println(p.getProductName() + " is out of stock.");
        }
    }

    public void addProduct(Product p, int quantity) {
        if (p.getStock() >= quantity) {
            for (int i = 0; i < quantity; i++) {
                products.add(p);
            }
            p.updateStock(quantity);
        } else {
            System.out.println("Insufficient stock for " + p.getProductName());
        }
    }

    public void removeProduct(String productName) {
        products.removeIf(product -> product.getProductName().equals(productName));
    }

    public double generateInvoice() {
        double total = 0;
        System.out.println("Invoice for Order ID: " + orderID);
        for (Product p : products) {
            System.out.println(p.getProductName() + " - Rs." + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: Rs." + total);
        return total;
    }
}

// Main Class to Test Functionality
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter product stock: ");
        int stock = scanner.nextInt();

        Product p1 = new Product(productName, price, stock);

        System.out.print("Enter second product name: ");
        scanner.nextLine(); // consume newline
        String productName2 = scanner.nextLine();
        System.out.print("Enter second product price: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter second product stock: ");
        int stock2 = scanner.nextInt();

        Product p2 = new Product(productName2, price2, stock2);

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2, 2);

        System.out.print("Enter product name to remove: ");
        scanner.nextLine(); // consume newline
        String removeProductName = scanner.nextLine();
        order.removeProduct(removeProductName);

        order.generateInvoice();
    }
}
