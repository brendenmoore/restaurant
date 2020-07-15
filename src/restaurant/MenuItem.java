package restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean newItem;
    private Date dateCreated;

    public MenuItem(String aName, Double aPrice, String aDescription, String aCategory) {
        setName(aName);
        setPrice(aPrice);
        setDescription(aDescription);
        setCategory(aCategory);
        setNewItem(true);
        this.dateCreated = new Date();
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Boolean isNewItem() {
        return newItem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "---\n" +
                (isNewItem() ? "NEW " : "") +
                name + ": " +
                description +
                " (" + category + ") " +
                "$" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
