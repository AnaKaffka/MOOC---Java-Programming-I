

public class Division {

    public static void main(String[] args) {
        division(3,5);
        int number1 = 6;
        int number2 = 2;

        division(number1,number2);
// Once you have implemented the division method, you can
        // try it out here. For example division(3,5);
        // should print "0.6"

        // division(3, 5);
    }

    public static void division(int numerator, int denominator){
        System.out.println("" + numerator + " / " + denominator + " = " + ((numerator * 1.0)/denominator));
    }

}
