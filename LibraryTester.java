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
