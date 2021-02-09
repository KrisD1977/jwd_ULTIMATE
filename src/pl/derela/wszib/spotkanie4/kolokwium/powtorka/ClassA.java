package pl.derela.wszib.spotkanie4.kolokwium.powtorka;

public class ClassA {

    int number;

    static boolean isEven(int number) {
        boolean iE = true;

        if (number % 2 != 0) {
             iE = false ;
        } else {iE = true;}

        System.out.printf("Czy liczba " + number + " jest podzielna przez dwa:" + iE);
        return iE;
    }

    public static void main(String[] args) {
        isEven(-110);

    }
}
