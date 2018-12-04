package CH7Arrays;
//create a program that prints the multiplication table
//from 1 through 5
public class Arrays2D {
    public static void main(String[] args) {
        //step1: declare a 2d array
        int[][] table = new int[5][10];
        for(int row = 0; row<table.length; row++) {
            for(int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }

        for(int row = 0; row<table.length; row++) {
            for(int col = 0; col < table[row].length; col++) {
                table[row][col] = row +1 * col+1;
            }
            System.out.println();
        }
    }
}
