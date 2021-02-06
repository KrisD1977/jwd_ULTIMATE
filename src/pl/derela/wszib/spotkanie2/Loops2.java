package pl.derela.wszib.spotkanie2;

import java.math.BigInteger;

public class Loops2 {

    public static void main(String[] args) {

     /*   int number = 5;
        int result = 1;


        for (int i = 1; i <= number; i++) {
            result = result *i;
        }
        System.out.println("Liczba: " + number + "! =" + result);
*/
        int number = 19;

        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= number ; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

        }
        System.out.printf ("%d! = %s%n", number,factorial);

    }
}
