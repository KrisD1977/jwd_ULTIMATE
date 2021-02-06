package pl.derela.wszib.spotkanie4otherpackage;

import pl.derela.wszib.spotkanie4other2.A;

public class B extends A {

    public static void main(String[] args) {
        B b = new B();
        b.number = 2;
        /*b.name = " B"; //nie ma dostępu bo dostęp (default)pakietowy zmiennej name*/
        b.name = "Tom"; // zrobiliśmy protected

    }
}
