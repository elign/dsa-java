import java.util.*;

public class RemoveDuplicatesForSortedArray {

// [1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 7, 8, 9]

// [1, 2, 3, 4, 5, 6, 7, 8, 9]

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        removeDuplicate(arr);

        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }

    }

    public static void removeDuplicate(int[] arr) {
        if(arr.length < 2) return;

        int first = 0;
        int second = 1;

        while(second < arr.length) {

            if(arr[first] != arr[second]) {

                arr[++first] = arr[second];
            }     
            second++;
        }
        for(int i = first + 1; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}