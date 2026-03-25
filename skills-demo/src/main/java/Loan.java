//Insert package name
package com.mycompany.skills.demo;

/**
 *
 * @author Alex Sheehan
 */

public class Loan {

    private String member;
    private String book;

    public Loan(String member, String book) {
        
    // Code and logic to add to Loan Class constructor

      if (!book.isAvailable()) { 
            throw new IllegalStateException("Book is not available."); 
        } 
  

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
}


