import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        System.out.println("");

        int small = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (small > number) {
                small = number;
            }
        }

        System.out.println("Smallest number: " + small);

        int numeroQueroPosicao = small;
        int index = list.get(0);
        for (int z = 0; z < list.size(); z++) {
            int numeros = list.get(z);
            if (numeroQueroPosicao == numeros) {
                System.out.println("Found at index: " + z);
            }
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }
}