import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroParaComparar = 0;

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            numeroParaComparar = Integer.valueOf(pieces[1]);
            lista.add(numeroParaComparar);
            nomes.add(pieces[0]);
        }
        int maior = lista.get(0);
        int index = 0;
        for (int i = 0; i < lista.size(); i++) {
            int number = lista.get(i);
            if (maior < number) {
                maior = number;
                index = i;
            }
        }
        System.out.println("Name of the oldest: " + nomes.get(index));

    }
}