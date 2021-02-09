package pl.derela.wszib.spotkanie4.powtorka;

public class LettersApp {

    public static void main(String[] args) {

        Letter a = new A();
        Letter b = new B();

        a.introduce();
        b.introduce();

        A aa = new B();
        aa.introduce();

    }


}

 interface Letter {

    void introduce();
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