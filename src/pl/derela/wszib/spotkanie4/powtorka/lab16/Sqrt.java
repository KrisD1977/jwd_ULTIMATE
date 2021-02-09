package pl.derela.wszib.spotkanie4.powtorka.lab16;

import java.util.Scanner;

public class Sqrt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = 0;

        try {
            number = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("podana wartośc nie jest liczbą");
            System.exit(-1);
        }


        if (number < 0 ) {
            throw new IllegalArgumentException();
        }

        double result =  Math.sqrt(number);
        System.out.println("Pierwiastek z liczby: " + number + " wynosi: " +result);


    }
}
