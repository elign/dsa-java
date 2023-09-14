import java.util.*;
public class UnionOfArrays {
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        // Input the size of array
        int size1 = sc.nextInt();
        // Input array 1
        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        // Input the size of array
        int size2 = sc.nextInt();
        // Input array 2
        int[] arr2 = new int[size2];
        for(int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
       int[] union = unionOfTwoArrays(arr1, arr2);
       printArray(union);
    }

    public static int[] unionOfTwoArrays(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                // union.get(union.size() - 1) === union[union.length - 1]
                if(union.size() != 0 && arr1[i] == union.get(union.size() - 1)) {
                    i++;
                    continue;
                }
                union.add(arr1[i]);
                i++;
            } else if(arr1[i] > arr2[j]) {
                if(union.size() != 0 && arr2[j] == union.get(union.size() - 1)) {
                    j++;
                    continue;
                }
                union.add(arr2[j]);
                j++;
            } else {
                if(union.size() != 0 && arr2[j] == union.get(union.size() - 1)) {
                    i++;
                    j++;
                    continue;
                }
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        while(i < arr1.length) {
            if(union.size() != 0 && arr1[i] == union.get(union.size() - 1)) {
                i++;
                continue;
            }
            union.add(arr1[i]);
            i++;
        }

        while(j < arr2.length) {
            if(union.size() != 0 && arr2[j] == union.get(union.size() - 1)) {
                j++;
                continue;
            }
            union.add(arr2[j]);
            j++;
        }
        return arrayListToArray(union);
    } 

    public static int[] arrayListToArray(ArrayList<Integer> list) {
        int[] ansArr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ansArr[i] = list.get(i);
        }
        return ansArr;
    }
}