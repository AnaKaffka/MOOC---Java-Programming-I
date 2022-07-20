public class AdvancedAstrology {

    public static void printStars(int number) {
        int time = 1;
        String star = "*";
        while (time <= number) {
            System.out.print(star);
            time++;
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {
        int space = 0;
        String spaces = " ";
        while (space < number) {
            System.out.print(spaces);
            space++;
        }

    }

    public static void printTriangle(int size) {
        int triangle = 1;
        while (triangle <= size) {
            printSpaces(size - triangle);
            printStars(triangle);
            triangle++;

        }
    }

    public static void christmasTree(int height) {
        int arvore = 1;
        while (arvore <= height) {
            printSpaces(height - arvore);
            printStars(2 * arvore - 1);
            arvore++;
        }
        printSpaces(height - 2);
        printStars(2 * 2 - 1);
        printSpaces(height - 2);
        printStars(2 * 2 - 1);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}