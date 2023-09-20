/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2app;

/**
 *
 * @author lab_services_student
 */
public class Books {
    
private String title;
    private String author;
    private String ISBN;

    public Books(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}
//In the code above :
//The class Books is declared with three private attributes: title, author, and ISBN.
//The constructor Books(String title, String author, String ISBN) is defined to initialize the attributes with the provided values.
//A getter methods getTitle(), getAuthor(), and getISBN() are implemented to return the corresponding attribute values. 


