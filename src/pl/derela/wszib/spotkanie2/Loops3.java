package pl.derela.wszib.spotkanie2;

public class Loops3 {

    public static void main(String[] args) {

        int number = 30;

        for (int i = 1; i <= number; i++) {
            if ( i % 2 == 0 ) {
                System.out.print(" " + i);
            } else {
                continue;
            }

        }
    }
}
