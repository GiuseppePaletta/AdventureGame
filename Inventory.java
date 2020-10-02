import java.util.ArrayList;

public class Inventory {

    private String item;

    public Inventory(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    //Eine neue Arraylist wird erstellt, bzw. ein neues Inventory für den Spieler angelegt
    private ArrayList<String> InventoryList = new ArrayList<String>();

    //Items werden in Inventory gespeichert
    public void addItemtoInventoryList(String item) {
        InventoryList.add(item);
    }


    public void showItemsInInventoryList() {
        System.out.println("You have the following items in your inventory:");
        for (int i = 0; i < InventoryList.size(); i++) {
            System.out.println(InventoryList.get(i));
        }
    }

    //Item aus Inventory löschen
    public void RemoveItem(String item) {
        InventoryList.remove(item);
    }


}