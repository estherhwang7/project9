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