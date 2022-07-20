import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroParaComparar = 0;
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            numeroParaComparar = Integer.valueOf(pieces[1]);
            lista.add(numeroParaComparar);

        }
        int maior = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            int number = lista.get(i);
            if(maior < number){
                maior = number;
            }
        }
        System.out.println("Age of the oldest: " + maior);

    }
}