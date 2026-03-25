//Insert package name
package com.mycompany.skills.demo;

/**
 *
 * @author Caelin Whelan
 */

public abstract class Member {

    // Declaring private variables;
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

    // Setter that sets a name
    public void setName(String name) {
        this.name = name;
    }
    
    // Returns email
    public String getEmail() {
        return email;
    }

    // Sets email address
    public void setEmail(String email) {
        this.email = email;
    }

    //Returns the borrowedBooks variable
    public int getBorrowedBooks() {
        return borrowedBooks;
    }
    
    // Setter that sets the value of borrowedBooks
    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    // Method that increases the value of the borrowedBooks variable
    public void incrementBorrowedBooks() {
        borrowedBooks++;
    }

    // if statement that decreases the value of borrowedBooks variable
    public void decrementBorrowedBooks() {
        if (borrowedBooks > 0) borrowedBooks--;
    }

    // Class is now abstract to support this abstract method
    public abstract int calculateBorrowLimit();

    // Boolean that checks if the amount of books the user wants to
    // borrow is within their borrow limits
    public boolean canBorrow() {
        return borrowedBooks < calculateBorrowLimit();
    }

    // String toString() that returns details user might find valuable
    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }// end main
}// end class
