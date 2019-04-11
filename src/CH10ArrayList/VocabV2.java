package CH10ArrayList;

//v2 of vocab program will help answer if melvilles
//writing had an influence from shakespeares work. this version
//uses regular expressions to clean up the data for better
//accuracy of our model

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VocabV2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("moby.txt"));
        Scanner input2 = new Scanner(new File("hamlet.txt"));

        ArrayList<String> list1 = getWords(input1);
        ArrayList<String> list2 = getWords(input2);

        //prints both data files of unique words
        System.out.println(list1);
        System.out.println(list2);

        ArrayList<String> overlap = overlap(list1, list2);
        System.out.println(overlap);

        //calculate the percent over lap
        double list1Percent = getPercentOverlap(overlap, list1);
        double list2Percent = getPercentOverlap(overlap, list2);

        System.out.println("Text1 words = " + list1.size());
        System.out.println("Text2 words = " + list2.size());
        System.out.println("overlap text1 = " + list1Percent);
        System.out.println("overlap text2 = " + list2Percent);
    }

    //this method reads in all the data from an external file
    //applies case folding, ArrayList is then sorted to eliminate
    //duplicates. the method returns an ArrayList of strings that are unique
    public static ArrayList<String> getWords(Scanner input) {
        //the regular expression below means "take any word that has
        //alphabetic characters and apostrophe's only"
        input.useDelimiter("[^a-zA-Z']+");

        //read all words and sort
        ArrayList<String> words = new ArrayList<String>();
        while (input.hasNext()) {
            words.add(input.next().toLowerCase());
        }
        Collections.sort(words);

        //eliminate the duplicates
        ArrayList<String> uniqueWords = new ArrayList<String>();
        if(words.size() > 0) {
            uniqueWords.add(words.get(0));
            for(int i = 1; i < words.size(); i++) {
                if (!words.get(i).equals(words.get(i - 1))) {
                    uniqueWords.add(words.get(i));
                }
            }
        }

        return uniqueWords;
    }

    public static ArrayList<String> overlap(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> overlap = new ArrayList<String>();
        int i1 = 0;
        int i2 = 0;
        while(i1 < list1.size() && i2 < list2.size()) {
            int compare = list1.get(i1).compareTo(list2.get(i2));
            if(list1.get(i1).equals(list2.get(i2))) {
                overlap.add(list1.get(i1));
                i1++;
                i2++;
            } else if(compare < 1) {
                i1++;
            } else {
                i2++;
            }

        }

        return overlap;
    }

    public static double getPercentOverlap(ArrayList <String> overlap, ArrayList<String> list) {
        return (double) overlap.size()/list.size()*100;
    }

}
