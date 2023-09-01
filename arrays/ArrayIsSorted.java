import java.util.*;

public class ArrayIsSorted {

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        if(isArraySorted(arr)) {
            System.out.println("Yes sorted!");
        } else {
            System.out.println("Unsorted!");
        }
        
    }

    public static boolean isArraySorted (int[] arr) {

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

}