package users;

import books.Book;
import java.util.ArrayList;

public class users {
    private String Name;
    private ArrayList<Book> borrowedBooks;
    private String id;


    public users(String name, ArrayList<Book> borrowedBooks, String id) {
        Name = name;
        this.borrowedBooks = borrowedBooks;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "users{" +
                "Name='" + Name + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                ", id='" + id + '\'' +
                '}';
    }
}
