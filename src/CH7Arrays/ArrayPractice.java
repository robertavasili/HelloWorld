package CH7Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //Step1: declare a variable
        int x;
        int[] numbers1 = new int[5]; //an int array of size 5
        //Step2: initialize the variable
        x = 5;
        System.out.println(Arrays.toString(numbers1)); //before populating the array
        for(int i = 0; i< 5; i++) {
            numbers1[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers1)); //after populating the array
        //OR

        //Step1&2: declare and initialize
        int y = 5;
        int [] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers2));
    }
}
