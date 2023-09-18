import java.util.*;

public class BinarySearch {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = 1000000;
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = i;
        }
        int num = 999999;  
        // System.out.println(normalSearch(arr, num)); 
        System.out.println(binarySearch(arr, num)); 

    }

    private static int normalSearch(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if(arr[i] == num) return i;
        }
        return -1;
    }

    private static Integer binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            System.out.println(arr[mid]);
            if(arr[mid] < num) {
                start = mid + 1;
            } else if(arr[mid] > num) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return null;
    }
}