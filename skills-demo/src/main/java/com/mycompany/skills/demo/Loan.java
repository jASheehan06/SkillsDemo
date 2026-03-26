//Insert package name
package com.mycompany.skills.demo;

/**
 *
 * @author Alex Sheehan
 */

public class Loan {

    private Member member;
    private Book book;

    public Loan(Member member, Book book) {

        // Check if book is available
        if (!book.isAvailable()) { 
            throw new IllegalStateException("Book is not available."); 
        }

        // Check if member can borrow
        if (!member.canBorrow()) { 
            throw new IllegalStateException("Borrow limit reached."); 
        }

        // Initialise member
        this.member = member;

        // Initialise book
        this.book = book;

        // Set book availability to false
        book.setAvailable(false);

        // Increment member borrowed books
        member.incrementBorrowedBooks();
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getLoanDetails() {
        return "Member: " + member + ", Book: " + book;
    }

    @Override
    public String toString() {
        return "Loan{" + "member=" + member + ", book=" + book + '}';
    }
}