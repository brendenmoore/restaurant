package restaurant;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(){
        lastUpdated = new Date();
        items = new ArrayList<>();
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void addItem(MenuItem newItem) {
        items.add(newItem);
        lastUpdated = new Date();
    }

    public void deleteItem(MenuItem aItem) {
        if (items.contains(aItem)) {
            items.remove(aItem);
        }
    }

    public void printMenu() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }
}
