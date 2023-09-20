/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package question2app;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author lab_services_student
 */
public class MyLibraryTest {
 private MyLibrary library;

    @Before
    public void setUp() {
        library = new MyLibrary(2);
        library.addBook(new Books("Book1", "Author1", "ISBN1"));
        library.addBook(new Books("Book2", "Author2", "ISBN2"));
    }

    @Test
    public void testAddBook() {
        
        Books newBook = new Books("Book3", "Author3", "ISBN3");
        library.addBook(newBook);
        assertEquals(newBook, library.searchBook("Book3"));
        
        
        Books bookToOverflow = new Books("Book4", "Author4", "ISBN4");
        library.addBook(bookToOverflow);
        assertNull(library.searchBook("Book4")); 
    }

    @Test
    public void testSearchBook() {
        
        Books foundBook = library.searchBook("peper pig");
        assertNotNull(foundBook);
        assertEquals("peper pig", foundBook.getTitle());

        
        Books notFoundBook = library.searchBook("NonExistentBook");
        assertNull(notFoundBook);
    }
    
   @Test
    public void testSearchBookNotFound() {
        Books book = new Books("harry potter", "neha seebran", "9876543210");
        library.addBook(book);

        Books foundBook = library.searchBook("har");
        assertNull(foundBook);
    }
    
    @Test
    public void testListBooks() {
        
        library.listBooks();
    }
}

  
  
