
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 0;
        int number = Integer.valueOf(scanner.nextLine());
        int ends = number + 1;

        for (int i = start; i < ends; i++) {
            System.out.println(i);
        }

    }
}
