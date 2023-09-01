import java.util.*;

public class MoveZeroesToEnd {

    public static void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        moveZeroesToEnd(arr);
        printArray(arr);
    }

// [1, 1, 1, 0, 0, 3, 0, 5, 6, 0, 7, 8, 9]
    public static void moveZeroesToEnd(int[] arr) {
        if(arr.length == 0) return;
        
        int start = 0;
        while(start < arr.length && arr[start] != 0) {
            start++;
        }
        int end = start + 1;

        while(end < arr.length) {

            if(arr[end] != 0) {
                arr[start] = arr[end];
                arr[end] = 0;
                start++;
            } 
            end++;
        }     
    }
}