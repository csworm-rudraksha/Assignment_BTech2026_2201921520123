package oops.jan27;

import java.util.*;

class FoodItem {
    private String name;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class Cart {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public void removeItem(String itemName) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(itemName));
    }

    public double getBill(DiscountPolicy discountPolicy) {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getTotalPrice();
        }
        return total - discountPolicy.calculateDiscount(total);
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (FoodItem item : items) {
                System.out.printf("%s (%.2f x %d) = %.2f\n", item.getName(), item.getTotalPrice() / item.getTotalPrice(), 1, item.getTotalPrice());
            }
        }
    }
}

abstract class DiscountPolicy {
    public abstract double calculateDiscount(double totalBill);
}

class FlatDiscount extends DiscountPolicy {
    @Override
    public double calculateDiscount(double totalBill) {
        return totalBill * 0.1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        DiscountPolicy discountPolicy = new FlatDiscount();

        while (true) {
            System.out.println("\n1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    cart.addItem(new FoodItem(name, price, quantity));
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemName = scanner.nextLine();
                    cart.removeItem(itemName);
                    break;

                case 3:
                    cart.displayItems();
                    break;

                case 4:
                    cart.displayItems();
                    double totalBill = cart.getBill(discountPolicy);
                    System.out.printf("Total Bill (after discount): %.2f\n", totalBill);
                    break;

                case 5:
                    System.out.println("Thank you for using the Food Ordering System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
