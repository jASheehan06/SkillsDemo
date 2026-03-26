//Insert package name
package com.mycompany.skills.demo;

/**
 *
 * @author Student Name
 */
public class LibraryItemTest {

    public static void main(String[] args) {

        // Create a LibraryItem instance
        LibraryItem item = new LibraryItem("Generic Item","L123");

        System.out.println("=== LibraryItem Test ===");
        
        // Test getters
        System.out.println("Item ID: " + item.getItemID());          // Expected: L001
        System.out.println("Title: ");                               // Expected: Generic Item
        System.out.println("Available: ");                           // Expected: true
        
        // Test setters
        item.setItemID("123");
        item.setTitle("Updated Title");
        item.setAvailable(false);        
        
        // To do Set title to "Updated Item"
        System.out.println("Updated Title: " + item.getTitle());    // Expected: Updated Item
        System.out.println("Updated Availability: " + item.isAvailable()); // Expected: false

        // Test toggle availability
        System.out.println("Toggle Availability Status: " + item.isAvailable());
        
        // To do Set Availability to true
        item.setAvailable(true);

        System.out.println("Availability after toggle: " + item.isAvailable()); // Expected: true

        // Print using toString
        System.out.println("LibraryItem: " + item.toString());                 // Should show ID, title, availability
    }
}