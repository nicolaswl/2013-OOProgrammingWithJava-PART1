/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> lib;
    
    public Library() {
        lib = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        lib.add(newBook);
    }
    
    public void printBooks() {
        for(Book b: lib) {
            System.out.println(b);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b: lib) {
            if(StringUtils.included(b.title(), title))
                found.add(b);
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b: lib) {
            if(StringUtils.included(b.publisher(), publisher))
                found.add(b);
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b: lib) {
            if(b.year() == year)
                found.add(b);
        }
        return found;
    }
}
