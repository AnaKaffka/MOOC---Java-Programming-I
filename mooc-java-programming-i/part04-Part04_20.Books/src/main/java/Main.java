import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();
        // implement here the program that allows the user to enter
        // book information and to examine them
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            String pages = scanner.nextLine();

            System.out.print("Publication year: ");
            String year = scanner.nextLine();

            books.add(new Books(title, pages, year));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String willPrint = scanner.nextLine();



        for (Books print: books){

            if (willPrint.equals("everything")){
                System.out.println(print);
            }
            if(willPrint.equals("name")){
                System.out.println(print.getName());
            }
            if(willPrint.equals("pages")){
                System.out.println(print.getPages());
            }
            if(willPrint.equals("year")){
                System.out.println(print.getYear());
            }
        }
    }
}
