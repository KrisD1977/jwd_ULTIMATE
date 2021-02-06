package pl.derela.wszib.spotkanie1.zadanie1;

public class Calculator {

    static void sum (int a, int b) {
        System.out.println("Suma liczb " + a + " + " + b + " wynosi: " +(a+b) );
    }
    static void minus (int a, int b) {
        System.out.println("Różnica liczb " + a + " - " + b + " wynosi: " +(a-b) );
    }
    static void multi (int a, int b) {
        System.out.println("Iloczyn liczb " + a + " * " + b + " wynosi: " +(a*b) );
    }


    public static void main(String[] args) {

        int x = 10;
        int y =14;

        sum(x,y);
        minus(x,y);
        multi(x,y);
    }


}
