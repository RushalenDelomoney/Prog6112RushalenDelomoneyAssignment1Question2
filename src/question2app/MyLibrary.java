/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lab_services_student
 */
public class MyLibrary {
    private List<Books> books;
    private int capacity;

    /**
     * Constructs a new Library object with the specified capacity.
     * @param capacity The maximum number of books that the library can hold.
     */
    public MyLibrary(int capacity) {
        this.books = new ArrayList<>(capacity);
        this.capacity = capacity;
    }
//used to set the librabries capacity
   
    public void addBook(Books book) {
        if (books.size() < capacity) {
            books.add(book);
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }
    // There is a method called addBook that takes a Book object as a parameter and adds it to a list of books. If the size of the list is less than the capacity, the book is added to the list and a success message is printed. Otherwise, a message indicating that the library is full is printed

    public Books searchBook(String keyword) {
       //searches for a book in a list of books based on a keyword entered by the user.
        for (Books book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getISBN().contains(keyword)) {
                return book;
            }
        }
        return null;
    }
    

    
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {         
            System.out.println("Books in the library:");
            for (Books book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println();
            }
        }
    }
}
//There is amethod calld listbooks which prints out information about the books in a library. If the library is empty, it prints "No books in the library."
//Or else it will print "Books in the library:" followed by the title, author, and ISBN of each book in the library. The method uses a for-each loop to iterate over the books collection and print out the information for each book


   

