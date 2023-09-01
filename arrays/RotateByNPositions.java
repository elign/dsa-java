import java.util.*;

public class RotateByNPositions {

// [1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 7, 8, 9]
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

        System.out.println("How many times do you want to rotate array? : ");
        int position = sc.nextInt();

        rotateArray(arr, position);

        printArray(arr);
    }
// [4, 3, 2, 1, 9, 8, 7, 6, 5]
// [5, 6, 7, 8, 9, 1, 2, 3, 4]
    public static void rotateArray(int[] arr, int position) {
        if(arr.length <= 1) return;
        position = position % arr.length;
        
        reverseArray(arr, 0, position - 1);
        reverseArray(arr, position, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }
    
    public static void reverseArray(int[] arr, int start, int end) {

        while(start < end) {
            int temp = arr[start]; //2
            arr[start] = arr[end]; //
            arr[end] = temp;
            start++;
            end--;
        }
    }
}