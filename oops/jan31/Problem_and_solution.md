### **E-Commerce Order Management System**
#### **Problem Statement**
Build an e-commerce system to manage products, orders, and invoices.

#### **Classes and Attributes**
1. `Product`:
    - Attributes: `productName`, `price`, `stock`.
    - Methods:
        - `updateStock(int quantity)`: Updates the stock of the product.
        - `isInStock()`: Checks if the product is available.

2. `Order`:
    - Attributes: `orderID`, `products` (list of `Product`), `status` (e.g., pending, shipped).
    - Methods:
        - `addProduct(Product p)`: Adds a product to the order.
        - `removeProduct(String productName)`: Removes a product from the order.
        - `generateInvoice()`: Calculates the total cost of the order.

#### **OOPs Concepts Covered**
- **Encapsulation:** Product stock and order details are private.
- **Abstraction:** Users interact with orders without managing stock directly.
- **Polymorphism:** Overloading `addProduct` to add multiple products at once.

