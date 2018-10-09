package CH7Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RobertaVasiliRandomHatV2 {


    // this is a global array we use to hold rearranged (randomized) teams
    private static int[] _gteams;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // 1. get user input
        int[] arrTeams = getData (console);

        rearrangeTeams(arrTeams, 0);

        show ();

    }

    // get user input
    private static int[] getData (Scanner console) {

        // initialize this to an odd number greater than zero
        // to enter the while loop below
        int total = 1;

        // ask user for the total number of teams to compete
        // till user puts 0 to exit or an even number to continue
        while(total % 2 != 0) {
            System.out.print("How many teams are there to compete (should be an even number) (type 0 to exit)? ");
            total = console.nextInt();

            if(total == 0) {
                return null;
            }
        }

        // instantiate the global array
        _gteams = new int[total];

        // initiate array
        int[] arr = new int[total];

        // populate the array with team numbers
        for(int i = 0; i < total; i++) {
            arr[i] = i + 1;
        }

        return arr;
    }

    // randomize teams
    private static void rearrangeTeams(int[] teams, int num)
    {
        if(teams.length == 0 || _gteams == null || num > _gteams.length + 1)
            return;

        // get a random index number from 0 to (teams.length - 1)
        Random rand = new Random();
        int idx = rand.nextInt(teams.length);

        // set/put selected team to the global array
        _gteams[num] = teams[idx];

        int[] arr = new int[teams.length - 1];
        int a = 0;

        // populate the new local array with the remaining teams
        for(int i = 0; i < teams.length; i++) {

            // exclude the team that was chosen once by random
            if(i == idx) {
                continue;
            }

            arr[a++] = teams[i];
        }

        // recall the same method with the remaining teams and with the incrementing index of the global array
        rearrangeTeams(arr, num + 1);

    }

    // show results on console
    public static void show () {
        System.out.println("These are matches that will be played:");

        for(int i = 0; i < _gteams.length; i+=2) {

            System.out.println(_gteams[i] + "\tvs.\t" + _gteams[i + 1]);
        }
    }
}