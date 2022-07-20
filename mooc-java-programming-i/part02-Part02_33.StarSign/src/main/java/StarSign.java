
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(7);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int time = 1;
        String star = "*";
        while (time <= number) {
            System.out.print(star);

            time++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int square = 1;
        while (square <= size) {
            printStars(size);
            square++;
        }
        System.out.println("");
    }


    public static void printRectangle(int width, int height) {
        int rectangle = 1;
        while (rectangle <= height){
            printStars(width);
            rectangle++;
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        int triangulo = 1;
        while (triangulo <= size){
            printStars(triangulo);
            triangulo++;
        }
        System.out.println("");
    }
}