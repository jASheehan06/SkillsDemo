/**
 *
 * @author Shane Caulfield
 */

public class StaffMember extends Member {
    
    private static final int maxBooks = 10;
    
    public StaffMember(int memberID, String name, String email, int borrowedBooks) {
        super(memberID, name, email, borrowedBooks);
    
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    @Override
    public int calculateBorrowLimit() { 
        return maxBooks;
    }
    
    @Override
    public String toString() {
        return "Staff Member [Max Books Allowed = " + maxBooks + "]";         
    }
}
