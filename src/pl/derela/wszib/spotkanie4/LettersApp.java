package pl.derela.wszib.spotkanie4;

public class LettersApp {

    public static void main(String[] args) {
        A a = new A();
        a.introduce();

        B b = new B();
        b.introduce();

        Letter letterA = new A();
        Letter letterB = new B();

        letterA.introduce();
        letterB.introduce();

        A aa = new B();
        aa.introduce();
    }
}

interface Letter {
    void introduce ();
}

class A implements Letter {
    @Override
    public void introduce() {
        System.out.println("Jestem A");
    }
}

class B extends A implements Letter {
    @Override
    public void introduce() {
        System.out.println("Jestem B");
    }
}