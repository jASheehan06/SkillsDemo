/**
 *
 * @author Thomas Sharp
 */

public class Book extends LibraryItem {

    private String title;
    private String itemID;
    private String author;
    private String isbn;

    public Book(String title, String itemID, String author, String isbn) {
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        // setter implementation
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                "\nAuthor: " + author;
    }
}
