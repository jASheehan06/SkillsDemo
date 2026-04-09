//Insert package name
package com.mycompany.skills.demo;

public class LibraryItem {

 /**
 *
 * @author Thomas Sharp, Caelin Whelan, Shane Caulfield, Alex Sheehan
 */
    
    private String title;
    private String itemID;
    private int memberID;
    private boolean available = true;


    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void registerMember() {
        // method implementation
        this.memberID = memberID;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", itemID=" + itemID +
                ", memberID=" + memberID +
                ", avaiable=" + available +
                '}';
    }
}