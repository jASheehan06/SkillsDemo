/**
 *
 * @author 
 */

public class Book extends LibraryItem {

    private String author;
    private String isbn;

    public Book(String title, int itemID, String author, String isbn) {
        super(title, itemID);
        // constructor implementation
    }   

    public String getAuthor() {
        return null;
    }

    public void setAuthor(String author) {
        // setter implementation
    }

    public String getIsbn() {
        return null;
    }

    public void setIsbn(String isbn) {
        // setter implementation
    }

    @Override
    public String toString() {
        return Kid(this.title, this.itemID, this.author, this.isbn);
    }
}
