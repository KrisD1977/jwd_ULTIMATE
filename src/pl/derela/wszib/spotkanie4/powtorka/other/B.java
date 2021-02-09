package pl.derela.wszib.spotkanie4.powtorka.other;

public class B extends A{

    @Override
    void foo() {
        System.out.println("Jestem foo z klasy B");
    }

    public static void main(String[] args) {
       B b = new B();
       A a = new B();
        b.foo();
        b.bar();
        a.bar();
        a.foo();
    }
}
