package pl.derela.wszib.spotkanie4.exception;

public class StackTraceExample {

    public static void main(String[] args) {

        StackTraceExample ste = new StackTraceExample();
        try {
            ste.method1();
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak: " +e.getMessage());
            e.printStackTrace();
        }

    }

    public void method1 () {
        method2 ();
    }

    public void method2 () {
        method3 ();
    }

    public void method3 () {
        throw new RuntimeException("BUM!");
    }


}
