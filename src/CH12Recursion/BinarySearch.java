package CH12Recursion;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] dataset = {1, 2, 3, 4, 5, 6, 7};

        //the following method call should return 0
        //System.out.println(binarySearch(dataset, 3));
        System.out.println(binarySearchRecursive(dataset, 500, 0, dataset.length - 1));
    }

    /**
     * //  public static int binarySearch(int[] dataset, int target) {
     * //    int mid = (dataset.length)/2;
     * //  while(dataset[mid] != target){
     * //  if(dataset[mid] == target){
     * //     return mid;
     * //  } else if(dataset[mid] > target){
     * //     mid = mid/2;
     * //} else {
     * //  mid = (mid + 1 + dataset.length)/2;
     * // }
     * //}
     * //return mid;
     * // }
     */


    public static int binarySearchRecursive(int[] dataset, int target, int min, int max) {
        //base case
        if (min > max) {
            return -1;
        } else {
            int mid = (max + min) / 2;
            if (dataset[mid] > target) {
                return binarySearchRecursive(dataset, target, min, mid - 1);
            } else if (dataset[mid] < target) {
                return binarySearchRecursive(dataset, target, mid + 1, max);
            } else {
                return mid;
            }

        }
    }
}
