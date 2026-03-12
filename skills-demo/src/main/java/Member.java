/**
 *
 * @author 
 */

public class Member {

    private int memberID;
    private String name;
    private String email;
    private int borrowedBooks;

    public Member(int memberID, String name, String email, int borrowedBooks) {
        // constructor implementation
        this.memberId = memberID;
        this.name = name;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        // setter implementation
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // setter implementation
        this.name = name;
    }

    public String getEmail() {
        return getEmail;
    }

    public void setEmail(String email) {
        // setter implementation
        this.email = email;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }


    public void incrementBorrowedBooks() {
        borrowedBooks++;
    }
    
    public void decrementBorrowedBooks() {
        if (borrowedBooks > 0) borrowedBooks--;
    }
    
    public abstract int calculateBorrowLimit();

/**
 *
 * @author 
 */

public class Member {

    private int memberID;
    private String name;
    private String email;
    private int borrowedBooks;

    public Member(int memberID, String name, String email, int borrowedBooks) {
        // constructor implementation
    }

    public int getMemberID() {
        return 0;
    }

    public void setMemberID(int memberID) {
        // setter implementation
        this.memberID = memberID;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
        // setter implementation
        this.name = name;
    }

    public String getEmail() {
        return null;
    }

    public void setEmail(String email) {
        // setter implementation
        this.email = email;
    }

    public int getBorrowedBooks() {
        return 0;
    }


    public void incrementBorrowedBooks() {
        borrowedBooks++;
    }
    
    public void decrementBorrowedBooks() {
        if (borrowedBooks > 0) borrowedBooks--;
    }
    
    public abstract int calculateBorrowLimit();
    
    public boolean canBorrow() {
        return borrowedBooks < calculateBorrowLimit();
    }
    
    public void setBorrowedBooks(int borrowedBooks) {
        // setter implementation
        this.borrowedBooks = borrowedBooks;
    }

    public void calculateBorrowLimit() {
        // method implementation
        if 
        
    }

    @Override
    public String toString() {
/**
 *
 * @author 
 */

public class Member {

    private int memberID;
    private String name;
    private String email;
    private int borrowedBooks;

    public Member(int memberID, String name, String email, int borrowedBooks) {
        // constructor implementation
    }

    public int getMemberID() {
        return 0;
    }

    public void setMemberID(int memberID) {
        // setter implementation
        this.memberID = memberID;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
        // setter implementation
        this.name = name;
    }

    public String getEmail() {
        return null;
    }

    public void setEmail(String email) {
        // setter implementation
        this.email = email;
    }

    public int getBorrowedBooks() {
        return 0;
    }


    public void incrementBorrowedBooks() {
        borrowedBooks++;
    }
    
    public void decrementBorrowedBooks() {
        if (borrowedBooks > 0) borrowedBooks--;
    }
    
    public abstract int calculateBorrowLimit();

    
    public boolean canBorrow() {
        return borrowedBooks < calculateBorrowLimit();
    }
    
    public void setBorrowedBooks(int borrowedBooks) {
        // setter implementation
        this.borrowedBooks = borrowedBooks;
    }

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
