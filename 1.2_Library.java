package task3;

public class Library {
    private final Book[] books;
    private int size;
    private static final int MAX_SIZE = 100;

    // Constructor to initialize the library with an array of books
    public Library() {
        this.books = new Book[MAX_SIZE];
        this.size = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (size < MAX_SIZE) {
            books[size++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to remove a book from the library
    public void removeBook(int bookId) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookId() == bookId) {
                books[i].setAvailable(false);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    // Method to search for a book by its ID
    public void searchBook(int bookId) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookId() == bookId) {
                System.out.println("Book found:");
                System.out.println("Book ID: " + books[i].getBookId());
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println("Availability: " + (books[i].isAvailable() ? "Available" : "Not Available"));
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (size == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < size; i++) {
                System.out.println("Book ID: " + books[i].getBookId() +
                        ", Title: " + books[i].getTitle() +
                        ", Author: " + books[i].getAuthor() +
                        ", Availability: " + (books[i].isAvailable() ? "Available" : "Not Available"));
            }
        }
    }
}
