package pl.derela.wszib.spotkanie1.zadanie1;

public class NumberSystemCalc {

    public static void main(String[] args) {

        int a = 13;
        int b = 2;
        int c = a + b;

        System.out.println("Liczby to: " + a + " + " + b + " = " + c+ "\n");

        /*System.out.println("binarnie");
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println("------------------------");
        System.out.println(Integer.toBinaryString(c));
        System.out.println();*/

        System.out.println("binarnie");
        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("----------");
        System.out.println(String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0'));


        System.out.println("ósemkowo");
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toOctalString(b));
        System.out.println("------------------------");
        System.out.println(Integer.toOctalString(c));
        System.out.println();

        System.out.println("szesnastkowo");
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println("------------------------");
        System.out.println(Integer.toHexString(c));





    }
}
