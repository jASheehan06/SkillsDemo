
//Insert package name

/**
 *
 * @author Student Name
 */
public class BookTest {
    public static void main(String[] args) {
        System.out.println("=== Book Test ===");

        // Create a Book instance  BOO1, Java Programming, J. Smith, 12345
        Book item = new Book("BOO1", "Java Programming", "J. Smith", "12345"); 

        // Print initial state
        System.out.println("Initial Book: " + Book);

        // Borrow the book
        System.out.println("\nBorrowing the book...");
        if (Book.isAvailable()) {
            //Set book availabilty to false
            item.setAvailable(false);

        System.out.println("Book borrowed successfully.");
        } else {
        System.out.println("Book is not available to borrow.");
        }

        // Attempt to borrow again (should fail)
        System.out.println("\nAttempting to borrow again...");
 
        //Insert code to check if book is not available
        System.out.println("Toggle Availability Status: " + item.isAvailable());
        
        //Output "Book is already on loan." 
        System.out.println("Book is already on loan.");

        // Return the book
        System.out.println("\nReturning the book...");
        
        //Set book availabilty to true 
        item.setAvailable(true);

        // Text when book is returned
        System.out.println("Book returned successfully.");

        // Final state
        System.out.println("\nFinal Book: " + book);
    }
}
