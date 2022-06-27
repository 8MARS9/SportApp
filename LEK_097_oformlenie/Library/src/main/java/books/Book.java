package books;

public class Book {
    public String name;
    public String author;
    public Integer yearOfRealise;
    public Integer numberOfPages;
    public String genre;

    public Book(String name, String author, int yearOfRealise, int numberOfPages, String genre) {
        this.name = name;
        this.author = author;
        this.yearOfRealise = yearOfRealise;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfRealise() {
        return yearOfRealise;
    }

    public void setYearOfRealise(int yearOfRealise) {
        this.yearOfRealise = yearOfRealise;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRealise=" + yearOfRealise +
                ", numberOfPages=" + numberOfPages +
                ", genre='" + genre + '\'' +
                '}';
    }
}


