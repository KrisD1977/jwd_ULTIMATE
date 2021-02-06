package pl.derela.wszib.spotkanie4.enums;

public class FormatterTester {

    public static void main(String[] args) {

        System.out.println(Formatter.CALM.format("Hi, how are you?"));
        System.out.println(Formatter.NERVOUS.format("Hi, whats up?"));
    }
}
