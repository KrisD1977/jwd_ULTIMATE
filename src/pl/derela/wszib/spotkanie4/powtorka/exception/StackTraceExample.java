package pl.derela.wszib.spotkanie4.powtorka.exception;

public class StackTraceExample {

    public static void main(String[] args) {

        StackTraceExample stackTraceExample = new StackTraceExample();
        try {
            stackTraceExample.method1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Coś poszło nie tak: " +e.getMessage());
        }


    }

    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }

    public void method3() {
        throw new RuntimeException("bUM");
    }


}

