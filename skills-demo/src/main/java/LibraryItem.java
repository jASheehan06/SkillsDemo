public class LibraryItem {

 /**
 *
 * @author Thomas Sharp, Caelin Whelan, Shane Caulfield, Alex Sheehan
 */

    
    private String title;
    private int itemID;
    private String memberID;

    public LibraryItem(String title, int itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void registerMember() {
        // method implementation
        this.memberID = memberID;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", itemID=" + itemID +
                ", memberID=" + memberID +
                '}';
    }
}