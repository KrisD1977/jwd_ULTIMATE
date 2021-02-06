package pl.derela.wszib.spotkanie4.lab14;

public class Hamster2 extends Animal2{

    private static int counter;
    private static String type = "chomik";

    public Hamster2() {
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
