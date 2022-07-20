public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;
        while (index < array.length) {
            int number = array[index];
            printStars(number);
            index++;
        }
        System.out.println("");
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
}