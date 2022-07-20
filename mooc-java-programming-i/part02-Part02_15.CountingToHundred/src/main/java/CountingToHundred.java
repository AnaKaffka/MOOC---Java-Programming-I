
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int ends = 100;

        for (int i = number; i <= ends; i++){
            System.out.println(i);
        }

    }
}
