import java.util.*;

public class SecondLargest {

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        // Input the size of array
        int size = sc.nextInt();
        // Input array
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        Integer secondLargestNumber = secondLargestNumberInArray(arr);
        // Print Largest
        System.out.println(secondLargestNumber);
    }

    public static Integer secondLargestNumberInArray(int[] arr) {

        if(arr.length == 0) return null;

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] >= largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if(arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE) return null;

        return secondLargest;
    }
}