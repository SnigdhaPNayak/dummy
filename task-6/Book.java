public class Book {
    private String bookTitle, author;
    private double price;

    public Book() {
    }

    public Book(String bookTitle, String author, double price) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Boob Title: " + bookTitle + ", Author: " + author + ", Price: $" + price;
    }
}
