

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
public static void printUntilNumber(int number) {
        int print = 1;
        while (print <= number) {
            System.out.println(print);
            print += 1;
        }
    }
}

