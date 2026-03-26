//Insert package name
package com.mycompany.skills.demo;

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
        
        System.out.println("\nCreated Student Member:");
        System.out.println(student);

        // Test getters Name, Email, Borrowed Books, Borrow Limit
          

        // Test setters setName Alice Smith, email alice.smith@example.com
        // Test setters
        student.setName("Alice Smith");
        student.setEmail("alice.smith@example.com");           


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
        // Create a StaffMember object
        StaffMember staff = new StaffMember(201, "Bob", "Bob@example.com", 1);
        System.out.println(staff);          

        // Test getters
        System.out.println("Member ID: " + staff.getMemberID());          // Expected: L001
        System.out.println("Name: " + staff.getName());                               // Expected: Generic Item
        System.out.println("Email: " + staff.getEmail());   

        // Test setters
        staff.setMemberID(123);
        staff.setName("Mike");
        staff.setEmail("Mike@example.com");

        // Test borrow books increment/decrement
        System.out.println("\nSimulate borrowing 5 books...");
        for (int i = 0; i < 5; i++) staff.incrementBorrowedBooks();
        System.out.println("Borrowed Books: " + staff.getBorrowedBooks()); // 5

        System.out.println("Simulate returning 3 books...");


        System.out.println("\n=== Member Tests Completed ===");
    }
}
