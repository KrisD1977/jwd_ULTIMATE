package pl.derela.wszib.spotkanie2.zadanie2;

import java.util.Random;

public class ChristmasTree {

    public static void main(String[] args) {
        int rows = 18;

        if (args.length > 0) {
            rows = Integer.parseInt(args[0]);
        }

        char[] trinkets = {'+', '.', '*', '~', '^', 'o','$','@','&'};
        Random random = new Random();


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            char[] trink = new char[2 * i + 1];
            for (int j = 0; j < trink.length; j++) {
                trink [j] = trinkets[random.nextInt(trinkets.length)];
                System.out.print(trink[j]);

            }
            System.out.println();
        }
    }
}
