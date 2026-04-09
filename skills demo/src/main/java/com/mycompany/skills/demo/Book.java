//Insert package name
package com.mycompany.skills.demo;

/**
 *
 * @author Thomas Sharp
 */

public class Book extends LibraryItem {

    private String title;
    private String itemID;
    private String author;
    private int isbn;
    
    // Tracks if book is currently borrowed or available
    private boolean isBorrowed = false;

    // Constructor for book
    public Book(String title, int isbn, String itemID, int bn) {
        super(title, itemID);
        this.title = title;
        this.itemID = itemID;
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    // Returns the item ID of the book
    public String getItemID() {
        return itemID;
    }

    // Returns true if the book is currently borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Set to true when borrowing, false when returning
    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               "\nAuthor: " + author;
    }
}