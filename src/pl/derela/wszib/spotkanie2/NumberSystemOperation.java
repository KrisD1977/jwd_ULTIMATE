package pl.derela.wszib.spotkanie2;

public class NumberSystemOperation {

    public static void main(String[] args) {

        int a = 10;
        int b = 010;
        int c = 0x10;

        int d = a + b -c;

        System.out.println(" Wynik " +a +" + "+ b +" - " + c + " = " +Integer.toBinaryString(d)+ " w systemie bin");

    }
}
