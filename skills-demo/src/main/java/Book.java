/**
 *
 * @author Thomas Sharp
 */

public class Book extends LibraryItem {

    private String author;
    private String isbn;

    public Book(String title, int itemID, String author, String isbn) {
        super(title, itemID);
        // constructor implementation
        this.title = title;
        this.itemID = itemID;
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
