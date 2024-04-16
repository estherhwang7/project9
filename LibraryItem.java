import java.util.*;

class LibraryItem {
    private String title;
    private String itemType;
    private boolean checkedOut;


    public LibraryItem(String title, String itemType) {
        this.title = title;
        this.itemType = itemType;
        this.checkedOut = false;
    }

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

    public String toString() {
        return "Title: " + title + ", Type: " + itemType + ", Checked Out: " + checkedOut;
    }

 
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        return checkedOut == ((LibraryItem) obj).checkedOut && title.equals(((LibraryItem) obj).title) && itemType.equals(((LibraryItem) obj).itemType);
    }
    

    public void checkOut() {
        if (!checkedOut) {
            System.out.println("Successfully checked out: " + title);
            checkedOut = true;
        }
        else {
            System.out.println("Item is already checked out.");
        }
    }


    public void checkIn() {
        if (checkedOut) {
            System.out.println("Successfully checked in: " + title);
            checkedOut = false;
        }
        else {
            System.out.println("Item is already checked in.");
        }
    }
}