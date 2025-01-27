### **Online Food Ordering System**
#### **Problem Statement**
Create a food ordering system that manages a cart, calculates bills, and applies discounts.

#### **Classes and Attributes**
1. `FoodItem`:
    - Attributes: `name`, `price`, `quantity`.
    - Methods:
        - `getTotalPrice()`: Calculates the total price based on quantity.

2. `Cart`:
    - Attributes: `items` (list of `FoodItem` objects).
    - Methods:
        - `addItem(FoodItem item)`: Adds an item to the cart.
        - `removeItem(String itemName)`: Removes an item by name.
        - `getBill()`: Calculates the total bill and applies discounts.

3. `DiscountPolicy`:
    - Methods (abstract):
        - `calculateDiscount(double totalBill)`: Calculates the discount.

4. `FlatDiscount` (inherits `DiscountPolicy`):
    - Overridden `calculateDiscount`: Applies a flat 10% discount.

#### **OOPs Concepts Covered**
- **Inheritance:** `FlatDiscount` extends `DiscountPolicy`.
- **Polymorphism:** Overriding `calculateDiscount` for custom discounts.
- **Encapsulation:** Cart operations are encapsulated in the `Cart` class.
