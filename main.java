import java.util.*;


class LibraryItem {
    // Instance variables
    protected String title;
    protected String itemType;
    protected boolean checkedOut;

    // Constructors
    public LibraryItem(String title, String itemType) {
        this.title = title;
        this.itemType = itemType;
        this.checkedOut = false;
    }

    // Accessors and modifiers
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    // toString method
    @Override
    public String toString() {
        return "Title: " + title + ", Type: " + itemType + ", Checked Out: " + checkedOut;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LibraryItem that = (LibraryItem) obj;
        return checkedOut == that.checkedOut && title.equals(that.title) && itemType.equals(that.itemType);
    }

    // Interesting method 1
    public void checkOut() {
        if (!checkedOut) {
            System.out.println("Successfully checked out: " + title);
            checkedOut = true;
        } else {
            System.out.println("Item is already checked out.");
        }
    }

    // Interesting method 2
    public void checkIn() {
        if (checkedOut) {
            System.out.println("Successfully checked in: " + title);
            checkedOut = false;
        } else {
            System.out.println("Item is already checked in.");
        }
    }
}








//////////////////////////////////////////////////
// Subclass 1
class Book extends LibraryItem {
    // Additional instance variable
    private String author;

    // Constructors
    public Book(String title, String author) {
        super(title, "Book");
        this.author = author;
    }

    // Accessors and modifiers
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Book book = (Book) obj;
        return author.equals(book.author);
    }

    // Override interesting method 1
    @Override
    public void checkOut() {
        System.out.println("Book checked out: " + title);
        setCheckedOut(true);
    }
}

// Subclass 2
class DVD extends LibraryItem {
    // Additional instance variable
    private String director;

    // Constructors
    public DVD(String title, String director) {
        super(title, "DVD");
        this.director = director;
    }

    // Accessors and modifiers
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", Director: " + director;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        DVD dvd = (DVD) obj;
        return director.equals(dvd.director);
    }

    // Override interesting method 2
    @Override
    public void checkIn() {
        System.out.println("DVD checked in: " + title);
        setCheckedOut(false);
    }
}

public class LibraryTester {
    public static void main(String[] args) {
        // Creating an ArrayList of superclass objects
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();

        // Creating and adding objects
        LibraryItem item1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem item2 = new DVD("Inception", "Christopher Nolan");
        LibraryItem item3 = new Book("To Kill a Mockingbird", "Harper Lee");
        LibraryItem item4 = new DVD("The Shawshank Redemption", "Frank Darabont");

        libraryItems.add(item1);
        libraryItems.add(item2);
        libraryItems.add(item3);
        libraryItems.add(item4);

        // Checking out items
        item1.checkOut();
        item2.checkOut();

        // Displaying items
        for (LibraryItem item : libraryItems) {
            System.out.println(item);
        }
    }
}
