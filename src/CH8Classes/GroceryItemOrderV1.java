//This program simulates grocery item which will be
//part of a grocery list. Grocery item will have
//name, quantity and priceperunit
package CH8Classes;

public class GroceryItemOrderV1 {
    //state fields
    private String name;
    private int quantity;
    private double ppu;


    //constructors
    public GroceryItemOrderV1(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;
    }

    //behaviors
    public double getCost() {
        return quantity * ppu;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Name: " + name + "\nQuantity: " + quantity +
                "\nPricePerUnit: $" + ppu + "\nTotalCost: $" + getCost() + "\n";
    }

}
