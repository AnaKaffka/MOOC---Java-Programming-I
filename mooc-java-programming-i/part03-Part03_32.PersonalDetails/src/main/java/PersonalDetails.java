import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            nomes.add(pieces[0]);
            sum = sum + Integer.valueOf(pieces[1]);
            count = count + 1;
        }
        String nomeMaisComprido = nomes.get(0);
        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
            if (nomeMaisComprido.length() < nome.length()) {
                nomeMaisComprido = nome;
            }
        }
        System.out.println("Longest name: " + nomeMaisComprido);
        if (count > 0) {
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        }

    }
}