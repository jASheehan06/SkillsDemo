public class Loan {

    private String member;
    private String book;

    public Loan(String member, String book) {
        // constructor implementation
        this.member = member;
        this.book = book;
    }

    public String getMember(String member) {
        return member;
    }

    public void setMember(String member) {
        // setter implementation
    }

    public String getBook(String book) {
        return book;
    }

    public void setBook(String book) {
        // setter implementation
    }

    public void getLoanDetails() {
        // method implementation
    }

    @Override
    public String toString() {
        return null;
    }
}
