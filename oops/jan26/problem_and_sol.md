
### **Library Management System**
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

