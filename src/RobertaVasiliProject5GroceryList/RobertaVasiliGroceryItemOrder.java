package RobertaVasiliProject5GroceryList;

/**
 * GroceryItemOrder represents a request to to purchase a particular item in a given quantity
 */
public class RobertaVasiliGroceryItemOrder {
    /**
     * Name of the item
     */
    private String name;
    /**
     * item quantity that was purchased
     */
    private int quantity;
    /**
     * price per unit
     */
    private double ppu;

    /**
     * GroceryItemOrder constructor
     * Constructs an item order to purchase the item with the given name, in the given quantity, which costs the given price per unit
     *
     * @param name item's name
     * @param quantity quantity purchased
     * @param ppu price per unit
     */
    public RobertaVasiliGroceryItemOrder(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;
    }

    /**
     * get total cost of this item
     *
     * @return total cost of this item in its given quantity
     */
    public double getCost(){
        return quantity * ppu;
    }

    /**
     * Sets this grocery item's quantity to be the given value
     *
     * @param quantity quantity to be set
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object.
     */
    public String toString() {
        return "Name: '" + name + "'; Price: $" + ppu + "; Quanity: " + quantity;
    }
}