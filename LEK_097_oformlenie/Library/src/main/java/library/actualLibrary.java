package library;

import javax.swing.*;
import books.Book;
import java.util.ArrayList;

public class actualLibrary {
    public ArrayList<Book> books = new ArrayList<Book>();

    public actualLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public actualLibrary() {
    }

    public void addBookToLibrary(){
       // public String name;
       // public String author;
       // public int yearOfRealise;
      //  public int numberOfPages;
       // public String genre;
        String name = JOptionPane.showInputDialog(null, "Enter the book name");
        String author = JOptionPane.showInputDialog(null, "Enter the book author");
        Integer yearOfRealise = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the book year of realise"));
        Integer numberOfPages = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of pages in the book"));
        String genre = JOptionPane.showInputDialog(null, "Enter the book genre");

        Book book = new Book(name, author, yearOfRealise, numberOfPages, genre);
        this.books.add(book);
    }

    public void viewAllBooks(){
        System.out.println(books);
    }
}
