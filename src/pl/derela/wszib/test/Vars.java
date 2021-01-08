package pl.derela.wszib.test;

import java.awt.*;

public class Vars {
    public static void main(String[] args) {
        char sign = '\t';
        char sign2 = 'C';
        System.out.println(sign2 +""+ sign +""+ sign2);

        int i = 7;
        i++;
        int x, y, z; // deklaracja x, y, z
        x = 42; // x otrzymuje wartość 42
        y = x++; // y otrzymuje wartość x (42)
// x zostaje zwiększone do 43
        z = ++x;

        System.out.println( i > 0  ? "x = x +1" : "x = x +2");

        if (x > 5) {
            y = 0;
        } else {
            y=1;
        }
        System.out.println(x + " " + y);


        System.out.println(i + " "+ x +" "+ y + " " + z );

        String napis = "Ala ";
        napis = napis + "ma kota ";
        napis += "i psa";
        System.out.println(napis);


        Point pt1 = new Point(100, 100);
        Point pt2 = pt1;
        pt1.x = 200;
        pt1.y = 200;
        System.out.println("Point1: " + pt1.x + ", " + pt1.y);
        System.out.println("Point2: " + pt2.x + ", " + pt2.y);

        int a = 5;
        double b = 13.5;
        int c = (int)b/a;
        System.out.println(c);

        Float f1 = 12.5F;
        Float f2 = 27.2F;
        System.out.println("Mniejsza z liczb: " + Math.min(f1,f2));


        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Wspaniale!");
                break;
            case 'B':
                System.out.println("Dobrze!");
                break;
            case 'C':
                System.out.println("Mogło być lepiej!");
                break;
            default:
                System.out.println("Rozważ oszukiwanie!");
        }

        int[] arr = new int[3];
        for (int u  : arr) {
            System.out.println(arr[u]);
        }






    }
}
