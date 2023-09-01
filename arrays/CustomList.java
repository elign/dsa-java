import java.util.*;
// [1, 0, 0, 0, 0, 0, 0, 0, 0, 9]
    public class CustomList {
        private int[] arr;
        private int idx = -1;

        CustomList() {
            arr = new int[5];
        }

        private void increaseSize () {
            int[] brr = new int[arr.length * 2];
            for(int i = 0; i < arr.length; i++) {
                brr[i] = arr[i];
            }
            arr = brr;
        }
        // push
        public void push(int val) {

            if(idx == arr.length - 1) {
                increaseSize();
            }
            idx++;
            arr[idx] = val;
        }
        // pop

        public int pop() {

            if(idx == -1) {
                return -1;
            }

            return arr[idx--];
        }

        // display
        public void display() {
            System.out.print("[");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.print("]");
        }

    }

