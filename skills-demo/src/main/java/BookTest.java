//Insert package name
import com.mycompany.skills.demo.StaffMember;
import com.mycompany.skills.demo.StudentMember;

/**
 *
 * @author Student Name 
 */
public class MemberTest {
    public static void main(String[] args) {
        System.out.println("=== Member Class Tests ===");

        // Create a StudentMember object
        StudentMember student = new StudentMember(101, "John Doe", "john.doe@example.com", 0);
        System.out.println(student);        

        // Create a StaffMember object
        StaffMember staff = new StaffMember(202, "John Bob", "john.Bob@example.com", 1);
        System.out.println(student);   
        
        System.out.println("\nCreated Student Member:");
        System.out.println(student);

        // Test getters Name, Email, Borrowed Books, Borrow Limit
          

        // Test setters setName Alice Smith, email alice.smith@example.com
        // Test setters
        item.setName("Alice Smith");
        item.setEmail("alice.smith@example.com");           


        System.out.println("Updated Student Member:");
        System.out.println(student);

        // Test borrow books increment/decrement
        System.out.println("\nSimulate borrowing 3 books...");
        student.incrementBorrowedBooks();


        System.out.println("Borrowed Books: " + student.getBorrowedBooks()); // 3

        System.out.println("Simulate returning 2 books...");
        student.decrementBorrowedBooks();


        System.out.println("Borrowed Books: " + student.getBorrowedBooks()); // 1

        // -------------------- TEST STAFF MEMBER --------------------
        //Create a staff member 201, "Bob", bob@example.com


        // Test getters


        // Test setters


        // Test borrow books increment/decrement
        System.out.println("\nSimulate borrowing 5 books...");
        for (int i = 0; i < 5; i++) staff.incrementBorrowedBooks();
        System.out.println("Borrowed Books: " + staff.getBorrowedBooks()); // 5

        System.out.println("Simulate returning 3 books...");


        System.out.println("\n=== Member Tests Completed ===");
    }
}
