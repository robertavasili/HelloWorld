import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class RobertaVasiliPersonalityTest {

    // global arr to hold number of A's and B's
    static int[] _countEI = {0,0};
    static int[] _countSN = {0,0};
    static int[] _countTF = {0,0};
    static int[] _countJP = {0,0};

    public static void main(String[] args) {

        String inputFileName;           // input file to read data from
        String outputFileName;          // out file to write data to


        int lineNumber = 0; 	// needed to calc the name or data
        String personName = ""; // first line data
        String dataline = "";	// second line data

        try {


            Scanner console = new Scanner(System.in); // to get user input


            System.out.print("Input file name: "); //ask user for input file name
            inputFileName = console.nextLine();

            File inputfile = new File(inputFileName);
            boolean exists = inputfile.exists();	//check if file exists

            while(!exists) { // loop till the input file exists
                System.out.print("File not found. Try again: ");
                inputFileName = console.nextLine();

                inputfile = new File(inputFileName);
                exists = inputfile.exists();
            }

            System.out.print("Output file name: "); //ask user for output name
            outputFileName = console.nextLine();

            Scanner scanner = new Scanner(inputfile);	// open the input file

            FileOutputStream fileoutstream = new FileOutputStream(outputFileName); 	// open the output file stream
            PrintStream psout = new PrintStream(fileoutstream); // prepare the string for writing

            // loop to read each line at a time
            while (scanner.hasNextLine()) {

                if(lineNumber % 2 == 0) { //this determines if the line is a name or the data
                    personName = scanner.nextLine();
                    lineNumber++;
                    continue; //resets to the beginning of the while loop after we read the person name so we dont have to process further data
                }

                dataline = scanner.nextLine().toUpperCase(); // get the data from the line and convert to uppercase for easy processing


                // method to analyze data
                AnalyzeLineData(dataline);

                // calculate and print
                CalculatePercentage(personName, psout);

                // reset the global arrays to zero for the next person
                ResetValues();

                lineNumber++;
            }

            // close all streams
            psout.close();
            scanner.close();


            System.out.print("Done. Output to file '" + outputFileName + "'");
            console.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            System.out.println("There was a problem");
        }

    }

    private static void AnalyzeLineData(String line) {
        // loop through each character of the line
        for(int i = 0; i < line.length(); i++) {
            //determine which group each question goes to
            if(i % 7 == 0) { // B
                if(line.charAt(i) == 'A') {
                    _countEI[0] +=  1;
                }
                else if(line.charAt(i) == 'B') {
                    _countEI[1] +=  1;
                }
            }
            else if(i % 7 == 1 || i % 7 == 2) { // A || B
                if(line.charAt(i) == 'A') {
                    _countSN[0] +=  1;
                }
                else if(line.charAt(i) == 'B') {
                    _countSN[1] +=  1;
                }
            }
            else if(i % 7 == 3 || i % 7 == 4) { // A || A
                if(line.charAt(i) == 'A') {
                    _countTF[0] +=  1;
                }
                else if(line.charAt(i) == 'B') {
                    _countTF[1] +=  1;
                }
            }
            else if(i % 7 == 5 || i % 7 == 6) { // A || A
                if(line.charAt(i) == 'A') {
                    _countJP[0] +=  1;
                }
                else if(line.charAt(i) == 'B') {
                    _countJP[1] +=  1;
                }
            }
        }
    }

    private static void CalculatePercentage(String personName, PrintStream psout) {

        //create a new temp array with type of String for each group of questions with the number of A's and B's answered, final percentage, and final letter results
        String[] stringEI = new String[4];
        String[] stringSN = new String[4];
        String[] stringTF = new String[4];
        String[] stringJP = new String[4];

        //copy values from the int arrays and convert to string to store into the temp array
        stringEI[0] = Integer.toString(_countEI[0]);
        stringEI[1] = Integer.toString(_countEI[1]);

        stringSN[0] = Integer.toString(_countSN[0]);
        stringSN[1] = Integer.toString(_countSN[1]);

        stringTF[0] = Integer.toString(_countTF[0]);
        stringTF[1] = Integer.toString(_countTF[1]);

        stringJP[0] = Integer.toString(_countJP[0]);
        stringJP[1] = Integer.toString(_countJP[1]);

        //compare the number of A's and B's that the person answered to determine their personality and store into the temp array
        // do the same for all types
        if(_countEI[0] > _countEI[1])
            stringEI[3] = "E";
        else if(_countEI[0] < _countEI[1])
            stringEI[3] = "I";
        else
            stringEI[3] = "X";

        stringEI[2] = Math.round(100 * _countEI[1] / (_countEI[0] + _countEI[1])) + "%"; //calc percent and round up and store in temp array


        if(_countSN[0] > _countSN[1])
            stringSN[3] = "S";
        else if(_countSN[0] < _countSN[1])
            stringSN[3] = "N";
        else
            stringSN[3] = "X";

        stringSN[2] = Math.round(100 * _countSN[1] / (_countSN[0] + _countSN[1])) + "%";


        if(_countTF[0] > _countTF[1])
            stringTF[3] = "T";
        else if(_countTF[0] < _countTF[1])
            stringTF[3] = "F";
        else
            stringTF[3] = "X";

        stringTF[2] = Math.round(100 * _countTF[1] / (_countTF[0] + _countTF[1])) + "%";


        if(_countJP[0] > _countJP[1])
            stringJP[3] = "J";
        else if(_countJP[0] < _countJP[1])
            stringJP[3] = "P";
        else
            stringJP[3] = "X";

        stringJP[2] = Math.round(100 * _countJP[1] / (_countJP[0] + _countJP[1])) + "%";

        //print to output file
        psout.println(personName + ":");
        psout.print(_countEI[0] + "A-" + _countEI[1] + "B ");
        psout.print(_countSN[0] + "A-" + _countSN[1] + "B ");
        psout.print(_countTF[0] + "A-" + _countTF[1] + "B ");
        psout.print(_countJP[0] + "A-" + _countJP[1] + "B");
        psout.println();
        psout.println("[" + stringEI[2] + ", " + stringSN[2] + ", " + stringTF[2] + ", " + stringJP[2] + "] = " + stringEI[3] + stringSN[3] + stringTF[3] + stringJP[3]);
        psout.println();
    }

    private static void ResetValues() { //reset/reinitialize arrays
        _countEI = new int[] {0,0};
        _countSN = new int[] {0,0};
        _countTF = new int[] {0,0};
        _countJP = new int[] {0,0};
    }

}