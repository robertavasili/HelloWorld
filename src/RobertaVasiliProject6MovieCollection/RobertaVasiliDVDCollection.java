package RobertaVasiliProject6MovieCollection;
/**
 * DVDCollection represents a collection of DVDs
 */
public class RobertaVasiliDVDCollection {
    /**
     * collection array of DVDs
     */
    private RobertaVasiliDVD[] collection;

    /**
     * count the number of DVDs
     */
    private int count;

    /**
     * total cost of all DVDs in the collection
     */
    private double totalCost;


    /**
     * add a DVD to the {@code collection} of DVDs and
     * increment the {@code count} and updates the {@code totalCost}
     *
     * @param title DVD title
     * @param director DVD director
     * @param year DVD year
     * @param cost DVD price
     * @param blueray true if it is Blu-Ray. false otherwise
     */
    public void addDVD(String title, String director, int year, double cost, boolean blueray){

        // add extra space to the array to add the new DVD
        increaseSize();

        // add the new DVD
        collection[count] = new RobertaVasiliDVD(title, director, year, cost, blueray);

        // increment count
        count++;

        // updates totalCost
        totalCost += cost;
    }

    /**
     * increase the size of collection by one if needed
     * it creates a new tempo array with the new size and swap them with collection
     */
    private void increaseSize(){
        // create tem array with one extra space
        RobertaVasiliDVD[] temp = new RobertaVasiliDVD[count + 1];

        // loop to populate the new tem array from existing collection
        for (int i = 0; i < count; i++){
            temp[i] = collection[i];
        }

        // swap arrays
        collection = temp;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return details of DVD collection
     */
    public String toString() {
        String result = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" +
                "My DVD Collection\r\n\r\n" +
                "Number of DVDs: " + count + "\r\n" +
                "Total cost: $" + String.format("%.2f", totalCost) + "\r\n" +
                "Average cost: $" + (count > 0 ? String.format("%.2f", totalCost/count) : 0.00) + "\r\n\r\n" +
                "DVD List\r\n\r\n";

        for(int i = 0; i < count; i++){
            result += (collection[i].toString() + "\r\n");
        }

        return result;
    }

}