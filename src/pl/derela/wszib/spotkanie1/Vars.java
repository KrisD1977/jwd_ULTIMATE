package pl.derela.wszib.spotkanie1;

import java.text.DecimalFormat;

public class Vars {

    public static void main(String[] args) {

        int number = 26;

        System.out.println("Nasza liczba to " + number + ".");
        System.out.println("Liczba " + number+ " jest o "  + (number - 8) + " większa od liczby  8.");
        System.out.println("Jeżeli pomnożymy " + number + " przez 5 to otrzymamy " +number * 5 + ".");


        int a = 12;

        double b = 2.432E-1;
        System.out.printf("%.20f",b);
        System.out.println();

        double c = 3E-10;
        double e = 3E+100;

        DecimalFormat df = new DecimalFormat("#.###########");
        System.out.println(df.format(c));
        System.out.println(df.format(e));

        int s = 0b101; //binarnie
        System.out.println(s);

        int g = 0101; // ósemkowo  0
        System.out.println(g);

        int h = 0x101; // szesnastkowo
        System.out.println(h);

        boolean chosen = false;

        char z = 'a';
        char m = 123; // kod ASCII
        System.out.println(z);
        System.out.println(m);

        String password = "raz \t\t\t\tdwa\t\t\t\ttrzy";
        System.out.println(password);
        System.out.println("\\");
        System.out.println("Naucz się szydełkować \u2122");





    }
}
