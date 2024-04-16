import java.util.*;
class DVD extends LibraryItem {
    private String director;

    public DVD(String title, String director) {
        super(title, "DVD");
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public String toString() {
        return super.toString() + ", Director: " + director;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        DVD dvd = (DVD) obj;
        return director.equals(dvd.director);
    }

    public void checkIn() {
        System.out.println("DVD checked in: " + title);
        setCheckedOut(false);
    }
}