//Insert package name
package com.mycompany.skills.demo;

/**
 *
 * @author Student Name
 */
public class BookTest {
    public static void main(String[] args) {
        System.out.println("=== Book Test ===");

        // Create a Book instance
        Book item = new Book("BOO1", "Java Programming", "J. Smith", 12345);

        // Print initial state
        System.out.println("Initial Book: " + item);

        // Borrow the book
        System.out.println("\nBorrowing the book...");
        if (item.isAvailable()) {
            // Set book availability to false
            item.setAvailable(false);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available to borrow.");
        }

        // Attempt to borrow again (should fail)
        System.out.println("\nAttempting to borrow again...");
        if (!item.isAvailable()) {
            System.out.println("Book is already on loan.");
        } else {
            item.setAvailable(false);
        }

        System.out.println("Toggle Availability Status: " + item.isAvailable());

        // Return the book
        System.out.println("\nReturning the book...");
        // Set book availability to true
        item.setAvailable(true);

        // Text when book is returned
        System.out.println("Book returned successfully.");

        // Final state
        System.out.println("\nFinal Book: " + item);
    }
}