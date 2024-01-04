package task3;

import java.util.Scanner;


//Main class to demonstrate the BookManagement System

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(bookId, title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeBookId = scanner.nextInt();
                    library.removeBook(removeBookId);
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchBookId = scanner.nextInt();
                    library.searchBook(searchBookId);
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting the Library System. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
