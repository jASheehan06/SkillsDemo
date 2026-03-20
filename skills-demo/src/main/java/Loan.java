package com.mycompany.skills.demo;

/**
 *
 * @author Alex Sheehan
 */

public class Loan {

    private String member;
    private String book;

    public Loan(String member, String book) {
        this.member = member;
        this.book = book;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getLoanDetails() {
        return "Member: " + member + ", Book: " + book;
    }

    @Override
    public String toString() {
        return "Loan{" + "member=" + member + ", book=" + book + '}';
    }
}package com.mycompany.skills.demo;

/**
 *
 * @author Alex Sheehan
 */

public class Loan {

    private String member;
    private String book;

    public Loan(String member, String book) {
        this.member = member;
        this.book = book;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getLoanDetails() {
        return "Member: " + member + ", Book: " + book;
    }

    @Override
    public String toString() {
        return "Loan{" + "member=" + member + ", book=" + book + '}';
    }
}/**
 *
 * @author Alex Sheehan
 */

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
        return loanDetails;
    }

    @Override
    public String toString() {
        return Loan(this.member, this.book);
    }
}
