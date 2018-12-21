//This program creates grocery list of items to purchase
//for the upcoming holidays

package CH8Classes;

public class GroceryListV1 {
    public static final int MAX_ITEMS = 10;
    //state fields
    private GroceryItemOrderV1[] list;
    private int numItems;

    //constructors
    public GroceryListV1() {
        list = new GroceryItemOrderV1[MAX_ITEMS];
        numItems = 0;
    }

    //behaviors
    public void addItem(GroceryItemOrderV1 itemOrderV1) {
        list[numItems] = item;
        numItems++;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for(int i = 0; i < numItems; i++) {
            totalCost += list[i].getCost();
        }
        return totalCost;
    }

    public String toString() {
        String myList = "";
        for(int i = 0; i < numItems; i++) {
            myList = myList + "Item: " + i + ": " + list[i];
        }
        return myList;
    }
}
