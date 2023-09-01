import java.util.*;

public class UsingCustomList {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 1;

        ArrayList<Integer> list = new ArrayList<>();

        do{
            if(option == 1) {
                System.out.println("Enter the value you want to push: ");
                int val = sc.nextInt();
                list.add(val);

            } else if(option == 2) {
                System.out.println("Popped value is: " + list.remove(list.size() - 1));

            } else if(option == 3) {
                // list.display();
                System.out.println(list);
            } else {
                break;
            }
            System.out.println("Enter you option: ");
            option = sc.nextInt();

        } while(true);
        
    }


}