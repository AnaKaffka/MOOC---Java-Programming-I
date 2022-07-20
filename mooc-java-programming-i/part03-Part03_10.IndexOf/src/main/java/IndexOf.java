import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while(true) {

            Integer numbers = Integer.valueOf(scanner.nextLine());
            list.add(numbers);
            if (numbers == -1) {
                break;
            }
        }
        System.out.println("Search for? ");
        Integer qual = Integer.valueOf(scanner.nextLine());
        for(int i = 0;i<= list.size()-1;i++)
            if (list.get(i) == qual){
                    System.out.println(qual + " is at index " + i);
            } else {
                continue;
        }
    }
}