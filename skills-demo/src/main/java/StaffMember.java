/**
 *
 * @author 
 */

public class StaffMember extends Member {

    private static final int maxBooks = 15;

    public StaffMember(int memberID, String name, String email, int borrowedBooks) {
        super(memberID, name, email, borrowedBooks);
        // constructor implementation
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    @Override
    public String toString() {
        return null;
    }
}
