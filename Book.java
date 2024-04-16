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