
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        while (true) {
            if (user.equals("alex")) {
                if (pass.equals("sunshine")) {
                    System.out.println("You have successfully logged in!");
                    break;
                } else {
                    System.out.println("Incorrect username or password!");
                    break;
                }
            }
            if (user.equals("emma")) {
                if (pass.equals("haskell")) {
                    System.out.println("You have successfully logged in!");
                    break;
                } else {
                    System.out.println("Incorrect username or password!");
                    break;

                }

            } else {
                System.out.println("Incorrect username or password!");
                break;
            }

        }
    }
}