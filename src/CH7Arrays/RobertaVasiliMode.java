package CH7Arrays;

import java.util.Scanner;

public class RobertaVasiliMode {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("What number do you want to find the mode for: ");
        int number = answer.nextInt();
        System.out.println("Mode is: " + goodMode(number));
    }

    public static int goodMode(int num) {
        int[] array = new int[10];
        while (num > 0) {
            int test = num % 10;
            array[test]++;
            num /= 10;
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;

    }
}
