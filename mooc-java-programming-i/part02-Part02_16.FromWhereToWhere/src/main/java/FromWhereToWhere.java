
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        int locationEnd = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int location = Integer.valueOf(scanner.nextLine());
        int start = location;
        for (int i = start; i <= locationEnd; i++) {
            System.out.println(i);
        }
    }
}
