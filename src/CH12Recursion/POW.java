package CH12Recursion;

public class POW {
    public static void main(String args[]) {
        System.out.println(iterative(3, 4));
        //System.out.println(recursive(3, 4));
    }

    public static int iterative(int base, int ex) {
        int count = 1;
        for (int i = 1; i <=ex; i++) {
            count *= base;

        }
        return count;
    }

}