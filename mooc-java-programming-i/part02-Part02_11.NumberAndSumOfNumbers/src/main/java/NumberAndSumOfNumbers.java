
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number: ");
            int entry = Integer.valueOf(scanner.nextLine());

            if (entry == 0) {
                break;
            }
            if (entry >= 0 || entry <= 0) {
                numberOfNumbers = numberOfNumbers + 1;
                sumOfNumbers = sumOfNumbers + entry;
            }

        }
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);

    }
}
