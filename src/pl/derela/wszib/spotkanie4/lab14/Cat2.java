package pl.derela.wszib.spotkanie4.lab14;

public class Cat2 extends Animal2{

    private static int counter;
    private static String type = "kot";

    public Cat2() {
        counter++;
    }

    @Override
    public int getInstanceNumber() {
        return counter;
    }

    @Override
    public String getType() {
        return type;
    }
}
