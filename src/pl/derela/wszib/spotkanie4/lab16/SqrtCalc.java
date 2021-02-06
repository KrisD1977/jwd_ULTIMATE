package pl.derela.wszib.spotkanie4.lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqrtCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double d = 0;


        try {
            /*d = Double.parseDouble(scanner.nextLine());*/
            d = scanner.nextDouble();
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Podana dana nie jest liczbą");
            System.exit(1);
        }

        if (d < 0 ) {
            throw new IllegalArgumentException();
        }

        System.out.println("Pierwiatek" + Math.sqrt(d));
    }
}
