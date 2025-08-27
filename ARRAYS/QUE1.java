class Book {
    String title;
    String author;

    // Constructor class
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 1: Create an array of 3 Book references
        Book[] books = new Book[3];

        // Edge Case: Uncommenting below will throw NullPointerException
        // System.out.println(books[0].title);

        // Step 2: Initialize each element with a new Book object
        books[0] = new Book("The Hobbit", "J.R.R. Tolkien");
        books[1] = new Book("1984", "George Orwell");
        books[2] = new Book("Clean Code", "Robert C. Martin");

        // Step 3: Print the titles of all books
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title);
        }
    }
}
