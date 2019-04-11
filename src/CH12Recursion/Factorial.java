package CH12Recursion;

public class Factorial {
    public static void main(String args[]) {
        System.out.println(iterativeFactorial(4));
        System.out.println(recursive(4));
    }

    public static int iterativeFactorial(int num) {
        int newNum = 1;
        for (int i = 1; i <= num; i++) {
            newNum *= i;
        }
        return newNum;
    }

    public static int recursive(int num) {
        if (num == 0) {
            return 1;
        } else {
            return recursive(num - 1) * num;
        }
    }
}