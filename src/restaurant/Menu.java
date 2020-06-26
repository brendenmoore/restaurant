package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> someItems){
        this.items = someItems;
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void addItem(MenuItem newItem) {
        this.items.add(newItem);
        this.lastUpdated = new Date();
    }
}
