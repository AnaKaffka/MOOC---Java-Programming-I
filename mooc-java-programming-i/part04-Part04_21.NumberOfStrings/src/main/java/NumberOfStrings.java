import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while (true) {

            String string = scanner.nextLine();
            index++;
            if (string.equals("end")) {
                break;
            }
        }
        System.out.println(index - 1);
    }
}
