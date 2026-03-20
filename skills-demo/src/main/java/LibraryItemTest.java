//Insert package name

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
        System.out.println("Item ID: " + item.getitemID());          // Expected: L001
        System.out.println("Title: ");                               // Expected: Generic Item
        System.out.println("Available: ");                           // Expected: true

        // Test setters
        // To do Set title to "Updated Item"
        
        item.setAvailable(false);

        System.out.println("Updated Title: " + item.getTitle());    // Expected: Updated Item
        System.out.println("Updated Availability: " + item.isAvailable()); // Expected: false

        // Test toggle availability
        // To do Set Availability to true

        System.out.println("Availability after toggle: " + item.isAvailable()); // Expected: true

        // Print using toString
        System.out.println("LibraryItem: " + item.toString());                 // Should show ID, title, availability
    }
}
