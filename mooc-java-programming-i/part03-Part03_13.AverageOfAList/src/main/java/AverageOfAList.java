import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfAList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
 
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
 
            list.add(input);
        }
        int average = 0;
        int soma = 0;
        for (Integer number : list) {
            soma += number;
            average++;
        }
        System.out.println("Average: " + (soma * 1.0) / average);
        // Then it computes the average of the numbers on the list
        // and prints it.
 
    }
}