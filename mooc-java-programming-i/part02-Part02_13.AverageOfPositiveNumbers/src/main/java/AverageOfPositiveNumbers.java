
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int number = 0;

        while (true) {
            int entry = Integer.valueOf(scanner.nextLine());

            if (entry == 0) {
                break;
            }
            if (entry > 0) {
                sum = sum + entry;
                number = number + 1;
            }
        }
        if (number == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / number);
        }

    }
}
