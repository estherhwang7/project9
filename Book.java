import java.util.*;

class Book extends LibraryItem {
    private String author;


    public Book(String title, String author) {
        super(title, "Book");
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String toString() {
        return super.toString() + ", Author: " + author;
    }


    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Book book = (Book) obj;
        return author.equals(book.author);
    }


    public void checkOut() {
        System.out.println("Book checked out: " + title);
        setCheckedOut(true);
    }
}