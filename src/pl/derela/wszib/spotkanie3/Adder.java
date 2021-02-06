package pl.derela.wszib.spotkanie3;

public class Adder {

    static int sum(int a, int b) {
        int c = a + b;
        return c;

    }

    static int sum(int a, int b, int c) {
        int d = a + b + c;
        return d;

    }

    public static void main(String[] args) {

        System.out.println(sum(1, 2, 4));
        System.out.println(sum(2, 3));
    }


}
