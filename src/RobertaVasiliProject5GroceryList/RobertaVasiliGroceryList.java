package RobertaVasiliProject5GroceryList;

/**
 * GroceryList represents a list of items to buy from the market
 */
public class RobertaVasiliGroceryList {

    /**
     * array List of items
     */
    private RobertaVasiliGroceryItemOrder[] orderList;

    /**
     * keeps truck of number of items added to the list
     */
    private int numItems;

    /**
     *
     * GroceryList constructor
     * Constructs a list of item orders to purchase
     */
    public RobertaVasiliGroceryList() {
        orderList = new RobertaVasiliGroceryItemOrder[10];
        numItems = 0;
    }

    /**
     * adds a new itemOrder to the list
     *
     * @param itemOrder itemOrder to be added to the list
     */
    public void addItem(RobertaVasiliGroceryItemOrder itemOrder){
        // loop through the array to find where to insert the new purchased itemOrder
        for (int i = 0; i < orderList.length; i++){
            // we add the itemOrder at the end of existing items
            // the end of existing items is when the value is null
            if(orderList[i] == null){
                orderList[i] = itemOrder;
                numItems += 1;

                // get out of the loop after adding this item
                break;
            }
        }
    }

    /**
     * get total cost of this list
     *
     * @return total cost of this list
     */
    public double getTotalCost(){

        double total = 0;

        for (int i = 0; i < orderList.length; i++) {
            // if no more items in the list get out of the loop
            if(orderList[i] == null)
                break;

            total += orderList[i].getCost();
        }

        return total;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object.
     */
    public String toString() {
        String result = "";

        for (int i = 0; i < orderList.length; i++) {

            // if no more items in the list get out of the loop
            if(orderList[i] == null)
                break;

            result += orderList[i].toString() + "\r\n";
        }

        return result;
    }
}