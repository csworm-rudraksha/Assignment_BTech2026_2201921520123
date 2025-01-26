package oops.jan26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book Class
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean availability;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = true;
    }

    public void issueBook() {
        if (availability) {
            availability = false;
            System.out.println("The book \"" + title + "\" has been issued.");
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }

    public void returnBook() {
        if (!availability) {
            availability = true;
            System.out.println("The book \"" + title + "\" has been returned.");
        } else {
            System.out.println("The book \"" + title + "\" was not issued.");
        }
    }

    public boolean isAvailable() {
        return availability;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + availability);
    }
}

// Library Class
class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book \"" + book.getTitle() + "\" has been added to the library.");
    }

    public List<Book> searchBook(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> searchBookByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public void listAvailableBooks() {
        System.out.println("\nAvailable Books in the Library:");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayDetails();
            }
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Search Book by Author");
            System.out.println("6. List All Available Books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.print("Enter Book Title to Issue: ");
                    String issueTitle = scanner.nextLine();
                    List<Book> issueBooks = library.searchBook(issueTitle);
                    if (!issueBooks.isEmpty()) {
                        issueBooks.get(0).issueBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Title to Return: ");
                    String returnTitle = scanner.nextLine();
                    List<Book> returnBooks = library.searchBook(returnTitle);
                    if (!returnBooks.isEmpty()) {
                        returnBooks.get(0).returnBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book Title to Search: ");
                    String searchTitle = scanner.nextLine();
                    List<Book> foundBooks = library.searchBook(searchTitle);
                    if (!foundBooks.isEmpty()) {
                        System.out.println("Search Results:");
                        for (Book book : foundBooks) {
                            book.displayDetails();
                        }
                    } else {
                        System.out.println("No books found with the title \"" + searchTitle + "\".");
                    }
                    break;

                case 5:
                    System.out.print("Enter Author Name to Search: ");
                    String searchAuthor = scanner.nextLine();
                    List<Book> authorBooks = library.searchBookByAuthor(searchAuthor);
                    if (!authorBooks.isEmpty()) {
                        System.out.println("Search Results:");
                        for (Book book : authorBooks) {
                            book.displayDetails();
                        }
                    } else {
                        System.out.println("No books found by the author \"" + searchAuthor + "\".");
                    }
                    break;

                case 6:
                    library.listAvailableBooks();
                    break;

                case 7:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
