package pl.derela.wszib.spotkanie4.powtorka.two;

import pl.derela.wszib.spotkanie4.powtorka.one.A;

public class B extends A {

    public static void main(String[] args) {

        B b = new B();
        b.number = 10;
        b.name = "Bb";
        B b1 = new B();
        b1.number = 100;
        b1.name = "Bb1";
        A a = new A();
        a.number = 200;

    }
}
