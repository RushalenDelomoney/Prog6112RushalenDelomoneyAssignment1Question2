/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question2app;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Question2App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        MyLibrary library = new MyLibrary(100);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    searchBook(scanner, library);
                    break;
                case 3:
                    library.listBooks();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    //Above their is a while loop Within the loop, the printMenu() function is called to display the menu options to the user. The user's input is then captured using a scanner.nextInt() statement, and the input is passed into a switch statement to determine which option was selected.  

    private static void printMenu() {
        System.out.println("Library Management System");
        System.out.println("1. Add a book");
        System.out.println("2. Search for a book");
        System.out.println("3. List all books");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    //The print menu will display a menu for the library andit will display the four menu options

    private static void addBook(Scanner scanner, MyLibrary library) {
        System.out.print(" Please enter book a  title: ");
        String title = scanner.nextLine();
        System.out.print(" Please enter the authors name: ");
        String author = scanner.nextLine();
        System.out.print(" Please enter ISBN: ");
        String ISBN = scanner.nextLine();
        Books newBook = new Books(title, author, ISBN);
        library.addBook(newBook);
    }
    //Allows the user to add a new book to the library

    private static void searchBook(Scanner scanner, MyLibrary library) {       
        System.out.print(" Please enter a  search keyword: ");
        String keyword = scanner.nextLine();
        Books foundBook = library.searchBook(keyword);
        if (foundBook != null) {
            System.out.println(" A book has been found:");
            System.out.println("Title: " + foundBook.getTitle());
            System.out.println("Author: " + foundBook.getAuthor());
            System.out.println("ISBN: " + foundBook.getISBN());
        } else {
            System.out.println(" No book has been found.");
         //// Ask the user for a search term and show details about the book that was located.   
        }
    }
}

