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