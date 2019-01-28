package RobertaVasiliProject6MovieCollection;
/**
 * RobertaVasiliMovies is the main entity of the program

 */

public class RobertaVasiliMovies {

    /**
     * main entry point of the app
     * @param args arguments to start the app with
     */
    public static void main(String[] args) {

        RobertaVasiliDVDCollection movies = new RobertaVasiliDVDCollection();

        movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
        movies.addDVD("District 9", "Neil Blomkamp", 2009, 19.95, false);
        movies.addDVD("Iron Man", "Jon Favreau", 2008, 15.95, false);
        movies.addDVD("All About Eve", "Joseph Mankiewicx", 1950, 17.50, false);
        movies.addDVD("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true);

        System.out.println(movies);

        movies.addDVD("Iron Man 2", "Jon Favreau", 2010, 22.99, false);
        movies.addDVD("Casablanca", "Michael Curtis", 1942, 19.95, false);

        System.out.println(movies);
    }

}