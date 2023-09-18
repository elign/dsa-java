import java.util.*;

public class LowerBound {

    public static void main (String[] args) {
        int[] arr = new int[]{1, 2, 2, 2, 3, 4, 5, 6};
    
        System.out.println(binarySearchForLowerBound(arr, 3));
    }

    private static Integer binarySearchForLowerBound(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = (start + end) / 2;
            if(arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}