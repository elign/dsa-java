import java.util.*;

public class Largest {

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        // Input the size of array
        int size = sc.nextInt();
        // Input array
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        Integer largestNumber = largestNumberInArray(arr);
        // Print Largest
        System.out.println(largestNumber);
    }

    public static Integer largestNumberInArray(int[] arr) {

        if(arr.length == 0) return null;

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {

                largest = arr[i];
            }
        }

        return largest;
    }
}