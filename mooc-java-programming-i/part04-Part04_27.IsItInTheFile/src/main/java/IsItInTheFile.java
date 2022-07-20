import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean notfound = true;
        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNextLine()) {
                String nome = scannerFile.nextLine();
                if (nome.equals(searchedFor)) {
                    notfound = false;
                    System.out.println("Found!");
                    break;
                }
            }

        } catch (Exception e) {
            notfound = false;
            System.out.println("Reading the file " + file + " failed.");
        }

        if (notfound) {
            System.out.println("Not found.");

        }

    }

}
