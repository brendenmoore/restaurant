package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        // create items and add to menu
        MenuItem pudding = new MenuItem("Chocolate pudding", 5.00, "It's yummy!", "Dessert");
        MenuItem salad = new MenuItem("Salad", 7.00, "It's healthy!", "Healthy Dishes");
        MenuItem steak = new MenuItem("Steak", 20.00, "It's tasty!", "Meat");
        MenuItem water = new MenuItem("Water", 0.00, "It's classic water!", "Drinks");

        Menu myNewMenu = new Menu();
        myNewMenu.addItem(pudding);
        myNewMenu.addItem(salad);
        myNewMenu.addItem(steak);
        myNewMenu.addItem(water);

        salad.setNewItem(false);
        water.setNewItem(false);

        // print the entire updated menu to the screen
        System.out.println("\n\nMENU:");
        myNewMenu.printMenu();

        // print an individual menu item to the screen
        System.out.println("\n\n\nJUST ONE ITEM:");
        System.out.println(steak);

        // delete an item from a menu, then reprint the menu
        myNewMenu.deleteItem(pudding);
        System.out.println("\n\n\nUPDATED MENU:");
        myNewMenu.printMenu();



    }
}
