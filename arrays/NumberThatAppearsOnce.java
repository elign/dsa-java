import java.util.*;

public class NumberThatAppearsOnce {
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
        System.out.println(numberThatAppearsOnce(arr));
    }

    private static Integer numberThatAppearsOnce(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if(pair.getValue() == 1) return pair.getKey();
        }
        return null;
    }
}