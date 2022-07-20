
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.println("Give a number: ");
            int entry = Integer.valueOf(scanner.nextLine());

            if (entry == 0) {
                break;
            }
            if (entry > 0) {
                number = number + 1;
            }
            if (entry < 0) {
                number = number + 1;
            }
        }
        System.out.println("Number of numbers: " + number);

    }
}
