package CH7Arrays;
import java.util.Arrays;

//This program will select two teams at random and determine which teams
//will go against each other in round 1

public class RandomNumber {

    public static void main(String[] args) {
        //Step1: Create an array with a size of 8 (number of teams)
        int[] teams = new int[8];

        //Step2: Populate the array with teams (1 - 8)
        for(int i = 0; i <= teams.length - 1; i++){
            teams[i] = i +1;
        }

        //Step3: Use the Random class to pick two teams
        int team1, team2 = 0;
    do {
        int pick = (int) (Math.random() * (((teams.length - 1) - 0) + 1) + 0);
        team1 = teams[pick];

        team2 = teams[pick];

    } while(team1 != team2);

    System.out.println("Team " + team1 + " vs. Team " + team2);

        //Step4: Check to make sure the team hasn't been picked before




        //Step5: Print which teams are going against each other
    }
}
