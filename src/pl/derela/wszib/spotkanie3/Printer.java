package pl.derela.wszib.spotkanie3;

public class Printer {

    int x = 0;
    int y = 1;

    void printMe() {
        System.out.println("X wynosi: " + x + ", Y wynosi: " + y);
        System.out.println("Jestem egzemplarzem klasy: " + this.getClass().getName());

    }
}
