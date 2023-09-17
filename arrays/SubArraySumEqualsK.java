import java.util.*;

public class SubArraySumEqualsK {
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        // int size = sc.nextInt();
        int[] arr = new int[] {2, 3, 5};
        int k = 5;
        // for(int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(size(arr, k));
        System.out.println(subarrayWithNegativeValues(arr, k));
    }

    private static int subarrayWithNegativeValues(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int target = sum - k;
            if(sum == k) {
                maxLength = Math.max(i + 1, maxLength);
            }
            if(map.containsKey(target)) {
                maxLength = Math.max(i - map.get(target), maxLength);
            }
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    private static Integer size (int[] arr, int k) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int sum = 0;
        while(end < arr.length) {
            sum += arr[end];
            if(sum > k){
                while(sum > k && start <= end) {
                    sum -= arr[start];
                    start++;
                }
            }
            if(sum == k) {
                int length = end - start + 1;
                maxLength = length > maxLength ? length : maxLength;
            }
            end++;
        }
        return maxLength;
    }
}