package pl.derela.wszib.spotkanie3;

public class HelloWorld {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World!!!");
            HelloWorld helloWorld = new HelloWorld();
            helloWorld.showName();

        }
    }


    class D {
    }

    void showName() {
        System.out.println("Krzysiek");
    }
}

class F {
}
