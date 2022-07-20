
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int numbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int entry = Integer.valueOf(scanner.nextLine());

            if (entry == 0) {
                break;
            }
            if (entry < 0 || entry > 0) {
                sum = sum + entry;
                numbers = numbers + 1;
            }
        }
        System.out.println("Average of the numbers: " + (sum / numbers));

    }
}
