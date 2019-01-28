package RobertaVasiliProject5GroceryList;
/**
 * RobertaVasiliGroceryListClient is the main entity of the app
 */
public class RobertaVasiliGroceryListClient {
    /**
     * main entry point of the app
     * @param args arguments to start the app with
     */
    public static void main(String[] args) {

        RobertaVasiliGroceryList list = new RobertaVasiliGroceryList();

        list.addItem(new RobertaVasiliGroceryItemOrder("Milk", 1, 2.39));
        list.addItem(new RobertaVasiliGroceryItemOrder("Eggs", 12, 0.37));
        list.addItem(new RobertaVasiliGroceryItemOrder("Cloves", 5, 0.07));
        list.addItem(new RobertaVasiliGroceryItemOrder("Vanilla", 1, 4.25));
        list.addItem(new RobertaVasiliGroceryItemOrder("White Sugar", 3, 1.35));
        list.addItem(new RobertaVasiliGroceryItemOrder("Light Cream", 1, 7.50));
        list.addItem(new RobertaVasiliGroceryItemOrder("Nutmeg", 1, 3.65));


        System.out.print(list.toString());
        System.out.println("--------------------------------------");
        System.out.println("TOTAL: " + list.getTotalCost());
    }
}