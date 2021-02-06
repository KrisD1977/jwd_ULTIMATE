package pl.derela.wszib.spotkanie3.lab10;

public class Calculator {

    static void add(int a, int b) {
        int c = a + b;
        System.out.println("Suma: " + a + " i " + b + " = " + c);
    }

    static void add(int a, int b, int x) {
        int c = a + b + x;
        System.out.println("Suma: " + a + " i " + b + " i " + x +" = " + c);
    }

    static void add(double a, double b) {
        double c = a + b;
        System.out.println("Suma: " + a + " i " + b + " = " + c);
    }

    static void add(double a, double b, double x) {
        double c = a + b + x;
        System.out.println("Suma: " + a + " i " + b + " i " + x + " = " + c);
    }

    public static void main(String[] args) {

        add(1,3);
        add(3.33,4.55);
        add(3,5,6);
        add(3.55,55,5.66);

        Calculator calc = new Calculator();
        calc.adder(3,5);
        calc.adder(3.45,5.66);
    }

    int  adder (int a, int b) {
           int c = a + b;
        System.out.println("Suma: " + a + " i " + b + " = " + c);
        return c;
    }
    double  adder (double a, double b) {
         double c = a + b;
        System.out.println("Suma: " + a + " i " + b + " = " + c);
        return c;
    }


}
