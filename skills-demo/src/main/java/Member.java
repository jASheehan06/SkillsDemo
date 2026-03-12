/**
 *
 * @author Caelin Whelan
 */
public abstract class Member {

    private int memberID;
    private String name;
    private String email;
    private int borrowedBooks;

    // Constructor that assigns all fields
    public Member(int memberID, String name, String email, int borrowedBooks) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
    }

    // Returns member ID
    public int getMemberID() {
        return memberID;
    }

    // Member ID setter
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    // Returns name
    public String getName() {
        return name;
    }

    // Name setter
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void incrementBorrowedBooks() {
        borrowedBooks++;
    }

    public void decrementBorrowedBooks() {
        if (borrowedBooks > 0) borrowedBooks--;
    }

    // Class is now abstract to support this abstract method
    public abstract int calculateBorrowLimit();

    public boolean canBorrow() {
        return borrowedBooks < calculateBorrowLimit();
    }

    // 
    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
