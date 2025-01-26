
### **1. Library Management System**
#### **Problem Statement**
Design a library management system that maintains a collection of books and allows users to perform operations like issuing and returning books.

#### **Classes and Attributes**
1. `Book`:
    - Attributes: `title`, `author`, `ISBN`, `availability` (boolean).
    - Methods:
        - `issueBook()`: Marks the book as unavailable.
        - `returnBook()`: Marks the book as available.
        - `isAvailable()`: Checks if the book is available.

2. `Library`:
    - Attributes: `books` (list of `Book` objects).
    - Methods:
        - `addBook(Book book)`: Adds a new book to the library.
        - `searchBook(String title)`: Searches and returns books by title.
        - `listAvailableBooks()`: Displays all available books.

#### **OOPs Concepts Covered**
- **Encapsulation:** Each `Book` object manages its own availability status.
- **Abstraction:** `Library` class hides internal book management.
- **Polymorphism:** Overloading `searchBook` to allow searching by author or title.

---

### **2. Online Food Ordering System**
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

---

### **3. Employee Payroll System**
#### **Problem Statement**
Develop a payroll system that calculates salaries and bonuses for employees with different roles.

#### **Classes and Attributes**
1. `Employee`:
    - Attributes: `name`, `ID`, `designation`, `baseSalary`.
    - Methods:
        - `calculateBonus()`: Returns the bonus (default 5% of base salary).

2. Subclasses (`Manager`, `Developer`, `Tester`):
    - Overrides `calculateBonus`:
        - `Manager`: 10% of base salary.
        - `Developer`: 8% of base salary.
        - `Tester`: 7% of base salary.

3. `PayrollSystem`:
    - Methods:
        - `calculateTotalSalary(Employee e)`: Adds base salary and bonus.

#### **OOPs Concepts Covered**
- **Inheritance:** `Manager`, `Developer`, and `Tester` extend `Employee`.
- **Polymorphism:** Method overriding for `calculateBonus`.
- **Encapsulation:** Sensitive salary details are private in the `Employee` class.

---

### **4. Parking Lot Management**
#### **Problem Statement**
Implement a parking lot system to manage vehicle parking and track available slots.

#### **Classes and Attributes**
1. `Vehicle`:
    - Attributes: `licensePlate`, `vehicleType` (car/bike).

2. `ParkingSlot`:
    - Attributes: `slotNumber`, `isOccupied`.
    - Methods:
        - `assignVehicle(Vehicle v)`: Assigns a vehicle to the slot.
        - `removeVehicle()`: Frees up the slot.

3. `ParkingLot`:
    - Attributes: `slots` (list of `ParkingSlot`).
    - Methods:
        - `parkVehicle(Vehicle v)`: Parks a vehicle in the first available slot.
        - `removeVehicle(String licensePlate)`: Removes a vehicle based on its license plate.
        - `checkAvailability()`: Counts free slots.

#### **OOPs Concepts Covered**
- **Abstraction:** `ParkingLot` hides slot management details.
- **Encapsulation:** Slot availability and assignments are private.
- **Polymorphism:** Method overloading for parking vehicles by type.

---

### **5. Movie Ticket Booking**
#### **Problem Statement**
Create a ticket booking system to manage movie screenings and bookings.

#### **Classes and Attributes**
1. `Movie`:
    - Attributes: `title`, `genre`, `availableSeats`.
    - Methods:
        - `bookSeat()`: Reduces available seats by 1.
        - `cancelSeat()`: Increases available seats by 1.

2. `Booking`:
    - Attributes: `bookingID`, `movie`, `seatsBooked`.
    - Methods:
        - `confirmBooking()`: Marks the booking as confirmed.
        - `cancelBooking()`: Cancels the booking.

3. `Theater`:
    - Attributes: `movies` (list of `Movie` objects).
    - Methods:
        - `addMovie(Movie m)`: Adds a movie to the list.
        - `searchMovie(String title)`: Finds a movie by title.
        - `displayAvailableSeats(Movie m)`: Shows available seats for a movie.

#### **OOPs Concepts Covered**
- **Inheritance:** A `3DMovie` class could inherit `Movie` and override seat pricing logic.
- **Encapsulation:** Booking details are private to the `Booking` class.
- **Polymorphism:** Overloading `searchMovie` to search by title or genre.

---

### **6. E-Commerce Order Management System**
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

---

### **7. Banking System**
#### **Problem Statement**
Create a banking system to manage customer accounts and transactions.

#### **Classes and Attributes**
1. `BankAccount`:
    - Attributes: `accountNumber`, `accountHolderName`, `balance`.
    - Methods:
        - `deposit(double amount)`: Increases the balance.
        - `withdraw(double amount)`: Decreases the balance if sufficient funds exist.
        - `transferFunds(BankAccount targetAccount, double amount)`: Transfers funds to another account.

2. Subclasses:
    - `SavingsAccount`: Overrides withdrawal to ensure a minimum balance.
    - `CurrentAccount`: No minimum balance requirement.

#### **OOPs Concepts Covered**
- **Inheritance:** `SavingsAccount` and `CurrentAccount` extend `BankAccount`.
- **Encapsulation:** Balance is private and managed through methods.
- **Polymorphism:** Method overriding for `withdraw`.

---

### **8. College Management System**
#### **Problem Statement**
Create a system to manage student records and course enrollments.

#### **Classes and Attributes**
1. `Student`:
    - Attributes: `rollNumber`, `name`, `course`, `marks`.
    - Methods:
        - `calculateGrade()`: Calculates grades based on marks.
        - `isEligibleForExam()`: Checks eligibility based on attendance.

2. `Course`:
    - Attributes: `courseName`, `students` (list of `Student` objects).
    - Methods:
        - `addStudent(Student s)`: Enrolls a student in the course.
        - `getTopper()`: Finds the student with the highest marks.

#### **OOPs Concepts Covered**
- **Encapsulation:** Marks and grades are private.
- **Abstraction:** Students interact with courses without managing enrollment logic.
- **Inheritance:** A `SpecialCourse` class could have unique eligibility rules.

---

### **9. Ride-Sharing Application**
#### **Problem Statement**
Build a ride-sharing app to manage rides and calculate fares.

#### **Classes and Attributes**
1. `Ride`:
    - Attributes: `rideID`, `driverName`, `vehicleType`, `distance`, `fare`.
    - Methods:
        - `calculateFare()`: Calculates fare based on distance and vehicle type.

2. `Rider`:
    - Attributes: `name`, `currentRide`.
    - Methods:
        - `bookRide(Ride ride)`: Books a ride.
        - `cancelRide()`: Cancels the current ride.

#### **OOPs Concepts Covered**
- **Encapsulation:** Fare calculation logic is private.
- **Abstraction:** Rider interacts with ride-booking without fare logic details.
- **Polymorphism:** Overloading `calculateFare` for different vehicle types.

---

### **10. Inventory Management System**
#### **Problem Statement**
Create a system to manage inventory for a warehouse.

#### **Classes and Attributes**
1. `Product`:
    - Attributes: `productID`, `productName`, `quantity`, `price`.
    - Methods:
        - `addStock(int quantity)`: Increases the stock.
        - `removeStock(int quantity)`: Decreases the stock if available.

2. `Warehouse`:
    - Attributes: `products` (list of `Product`).
    - Methods:
        - `findProduct(String productName)`: Finds a product in the warehouse.
        - `displayLowStock()`: Lists products with low stock.

#### **OOPs Concepts Covered**
- **Encapsulation:** Stock management logic is private.
- **Abstraction:** Users interact with the warehouse without managing individual stocks.

---

### **11. Hospital Management System**
#### **Problem Statement**
Develop a hospital system to track patient records and doctor assignments.

#### **Classes and Attributes**
1. `Patient`:
    - Attributes: `patientID`, `name`, `disease`, `assignedDoctor`.
    - Methods:
        - `assignDoctor(Doctor d)`: Assigns a doctor to the patient.
        - `getDetails()`: Returns patient details.

2. `Doctor`:
    - Attributes: `doctorID`, `name`, `specialization`.
    - Methods:
        - `viewPatients()`: Lists all patients assigned to the doctor.

#### **OOPs Concepts Covered**
- **Encapsulation:** Patient and doctor details are private.
- **Abstraction:** Doctor and patient management are separated.
- **Polymorphism:** Method overriding for custom disease-specific assignments.

---

### **12. Chat Application**
#### **Problem Statement**
Build a chat application to manage users and messages.

#### **Classes and Attributes**
1. `User`:
    - Attributes: `username`, `status` (online/offline).
    - Methods:
        - `sendMessage(User recipient, String message)`: Sends a message.
        - `changeStatus(String status)`: Updates the user's status.

2. `ChatRoom`:
    - Attributes: `messages` (list of message history).
    - Methods:
        - `viewMessages()`: Displays the chat history.
        - `addUser(User u)`: Adds a user to the chat room.

#### **OOPs Concepts Covered**
- **Encapsulation:** Message history is private.
- **Abstraction:** Users interact without knowing how messages are stored.
- **Polymorphism:** Overloading `sendMessage` to include media.

---

### **13. E-Wallet System**
#### **Problem Statement**
Create a wallet system to manage transactions and balances.

#### **Classes and Attributes**
1. `Wallet`:
    - Attributes: `walletID`, `user`, `balance`.
    - Methods:
        - `addMoney(double amount)`: Adds money to the wallet.
        - `makePayment(double amount)`: Deducts money for a transaction.
        - `viewBalance()`: Returns the wallet's balance.

#### **OOPs Concepts Covered**
- **Encapsulation:** Balance is private.
- **Abstraction:** Users interact without handling the underlying transaction logic.

---

### **14. Social Media Application**
#### **Problem Statement**
Develop a social media app to manage posts and user interactions.

#### **Classes and Attributes**
1. `Post`:
    - Attributes: `content`, `likes`, `comments`.
    - Methods:
        - `likePost()`: Increments the like count.
        - `addComment(String comment)`: Adds a comment to the post.

2. `User`:
    - Attributes: `username`, `posts`.
    - Methods:
        - `createPost(String content)`: Adds a new post.
        - `viewTimeline()`: Displays all posts.

#### **OOPs Concepts Covered**
- **Encapsulation:** Post details are private.
- **Abstraction:** Users only interact with posts through methods.

---

### **15. Weather Forecasting System**
#### **Problem Statement**
Build a weather system to provide forecasts for different locations.

#### **Classes and Attributes**
1. `Weather`:
    - Attributes: `temperature`, `humidity`, `condition` (e.g., sunny).
    - Methods:
        - `updateWeather(String location, double temp, String condition)`: Updates the weather.
        - `displayForecast()`: Displays the weather forecast.

#### **OOPs Concepts Covered**
- **Encapsulation:** Weather details are private.
- **Abstraction:** Users interact through a clean interface.
- **Polymorphism:** Overloading `updateWeather` for different input types.


