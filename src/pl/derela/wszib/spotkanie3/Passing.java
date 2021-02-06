package pl.derela.wszib.spotkanie3;

import java.awt.*;

public class Passing {

    public static void main(String[] args) {
        int i = 10;

        System.out.println("Przed zmianą: " + i );
        changeIt(i);                              /// nic nie zmienia bo lokalnie
        System.out.println("Po zmianie : " + i );
        changeIt(i);
        System.out.println("Po zmianie : " + i );
        System.out.println("-----------------------------");

        Point point = new Point(1,1);
        System.out.println("Point przed zmianą " + point );
        changeIt(point);                              /// nic nie zmienia bo lokalnie
        System.out.println("Po zmianie : " + point );
        changeIt(point);
        System.out.println("Po zmianie : " + point );

    }


    static  void changeIt(int i) {          /// metoda nic nie zmienia bo nigdy zmienna lokalna nie wychodzi
        System.out.println("Zmieniam i ");
        i++;
    }

    static  void changeIt(Point p ) {          /// metoda nic nie zmienia bo nigdy zmienna lokalna nie wychodzi
        System.out.println("Zmieniam point ");
        p.x++;
        p.y++;
    }

}
/*
    public static void main(String[] args) {
        int i = 10;
        Passing p1 = new Passing();
        p1.i= 11;

        System.out.println("Przed zmianą: " + p1.i );
        p1.changeIt(p1.i);
        System.out.println("Po zmianie : " + p1.i );
        p1.changeIt(p1.i);
        System.out.println("Po zmianie : " + p1.i );

    }
    public   void changeIt(int i) {
        System.out.println("Zmieniam i ");
        this.i = i +1;
    }*/
