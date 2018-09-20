//This program takes user input and calculates the avg. temp
//for n days. The program also identifies how many days are above
//avg.
package CH7Arrays;

        import java.util.Arrays;
        import java.util.Scanner;

public class WeatherAnalysis {
    public static void main(String[] args) {
        //Step1: Ask the user how many days of temperature they want to put
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        calc(days, console);
        //Step6: Compare the average with the values in the array
        //Step7: Print output (there are x days above the average)
    }

    public static void calc (int days, Scanner console) {
        //Step2: Create an array and make it the size of the number of days the
        //user wants to put
        int sum = 0;
        int data = 0;
        int[] temps = new int[days];
        //Step3: Read in the user input for the array (for loops)
        for(int i = 0; i < days; i++) {
            //Step4: Sum the values within the array (inside for loop) (cumulative sum)
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            data = console.nextInt();
            temps[i] = data;
            sum += data;
        }

        avg(days, sum);
    }

    public static void avg(int days, int sum) {
        //Step5: Take the average
         double average = 0;
         double roundAvg = 0;
         average = (double)sum/days;
         roundAvg = (Math.round(average * 10.0)) / 10.0;
         System.out.println("Average temp = "  + roundAvg);
    }
}
