/**
 *
 * @author Shane Caulfield
 */

public class StaffMember extends Member {
    

    private int maxBooks; 

    public StaffMember(int memberID, String name, String email, int borrowedBooks) {
        super(memberID, name, email, borrowedBooks);
        this.maxBooks = 15; 
        // constructor implementation
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    @Override
    public String toString() {
        return "Staff Member [Max Books Allowed = " + maxBooks + "]";         
    }
}
