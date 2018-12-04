package CH7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RobertaVasiliSum {

    private static int MAX_VALUE_LENGTH = 25;             // max number of digits to process
    private static String FileName = "sum.txt";           // input file to read data from

    public static void main(String[] args) {

        int lineNumber = 0;

        try {
            Scanner scanner = new Scanner(new File(FileName));

            String line = "";

            // loop to read each line at a time
            while (scanner.hasNextLine()) {


                line = scanner.nextLine();

                // get arr of values from line
                String[] values = ExtractValues(line);

                // calculate and print
                Calculate(values);

                lineNumber++;
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println("Total lines = " + lineNumber);
    }

    private static String[] ExtractValues(String line) {

        // get rid of multiple spaces
        while(line.indexOf("  ") != -1)
        {
            line = line.replace("  ", " ");
        }

        int length = line.length();
        if(length == 0)
            return null;

        int numberOfValues = 0;
        String value = "";
        // init the temporary arr with a guess max value of string length
        String[] arr = new String[length];

        // extract values
        int idx = line.indexOf(' ');
        while(idx != -1)
        {
            value = line.substring(0, idx);
            arr[numberOfValues] = value;
            numberOfValues++;

            line = line.substring(idx + 1);
            idx = line.indexOf(' ');
        }
        // last remaining value
        arr[numberOfValues] = line;

        // prepare the new array to return with the appropriate size
        String[] result = new String[numberOfValues + 1];
        for(int i = 0; i < numberOfValues + 1; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    private static void Calculate(String[] input) {
        int length = input.length;

        // create a new array that holds values with leading zeros
        String[] arr = new String[length];

        // populate the new array with proper values with leading zeros by calling AddZeroes() for each element
        for(int i = 0; i < length; i++) {
            arr[i] = AddZeroes(input[i]);
        }

        char c;
        int n = 0;
        int carry = 0;
        String result = "0";

        // loop through each char of each element starting from the end (MAX_VALUE_LENGTH - 1)
        for(int col = MAX_VALUE_LENGTH - 1; col >= 0; col--) {

            for(int i = 0; i < length; i++) {
                c = arr[i].charAt(col);
                n += Character.getNumericValue(c);
            }

            if(n == 0 && carry == 0)
                break;

            n += carry;

            if(n > 9)
            {
                carry = n / 10;
                n = n % 10;
            }
            else
            {
                carry = 0;
            }

            // prepend the number to the final string
            result = n + result;

            n = 0;
        }

        PrintResult(input, result);

    }

    private static String AddZeroes(String input) {
        String result = input;
        String empty = new String();

        // eliminate empty values
        if(input.equals(empty) || input.equals(null) || input.equals(" "))
            return "";

        while (result.length() < MAX_VALUE_LENGTH) {
            result = "0" + result;
        }

        return result;
    }

    private static void PrintResult(String[] input, String result) {

        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);

            if(i < input.length - 1){
                System.out.print(" + ");
            }
        }

        System.out.print(" = " + result);
        System.out.println();
    }
}