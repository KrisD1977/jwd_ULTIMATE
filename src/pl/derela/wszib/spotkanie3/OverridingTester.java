package pl.derela.wszib.spotkanie3;

public class OverridingTester {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        B b = new B();
        b.show();

    }


}

class A {
    void show () {
        System.out.println("A");
    }
}

class B extends A{
    void show () {                   // przesłonięcie metody show z A
        System.out.println("B");
    }
}


