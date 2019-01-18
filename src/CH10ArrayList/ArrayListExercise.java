package CH10ArrayList;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File("data.txt"));
        ArrayList<String> words = new ArrayList<String>();
        while(console.hasNext()){
            words.add(console.nextLine());
        }

        System.out.println(words);
    }
}
