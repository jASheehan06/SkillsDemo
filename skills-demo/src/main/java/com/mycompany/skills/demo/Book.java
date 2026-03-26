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

    public Book (String title, String itemID, String author, int isbn) {
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
        // setter implementation
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        // setter implementation
        this.isbn = isbn;
    }
    
    @Override
    public String toString() {
        return "Title: " + title +
                "\nAuthor: " + author;
    }
}
