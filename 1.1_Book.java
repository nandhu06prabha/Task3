package task3;

public class Book {
    private final int bookId;
    private final String title;
    private final String author;
    private boolean isAvailable;

    // Constructor to initialize a book with given attributes
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter method to update availability status
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
