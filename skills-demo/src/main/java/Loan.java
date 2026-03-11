/**
 *
 * @author 
 */

public class Loan {

    private String member;
    private String book;

    public Loan(String member, String book) {
        // constructor implementation
    }

    public String getMember(String member) {
        return member;
    }

    public void setMember(String member) {
        // setter implementation
        this.member = member;
    }

    public String getBook(String book) {
        return book;
    }

    public void setBook(String book) {
        // setter implementation
        this.book = book;
    }

    public void getLoanDetails() {
        // method implementation
    }

    @Override
    public String toString() {
        return Loan(this.member, this.book);
    }
}
