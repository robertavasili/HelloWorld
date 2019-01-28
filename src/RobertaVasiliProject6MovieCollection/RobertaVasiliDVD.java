package RobertaVasiliProject6MovieCollection;
/**
 * DVD represents a DVD and its properties
 */
public class RobertaVasiliDVD {
    /**
     * DVD title
     */
    private String title;

    /**
     * DVD director
     */
    private String director;

    /**
     * DVD year
     */
    private int year;

    /**
     * DVD price
     */
    private double cost;

    /**
     * is blueray
     */
    private boolean blueray;


    public RobertaVasiliDVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return details of this DVD
     */
    public String toString() {
        String result = "$" + String.format("%.2f", cost) + "\t" + year + "\t" + String.format("%-20s", title) + "\t" + String.format("%-25s", director);
        if(blueray)
            result += "\tBlu-Ray";

        return result;
    }
}