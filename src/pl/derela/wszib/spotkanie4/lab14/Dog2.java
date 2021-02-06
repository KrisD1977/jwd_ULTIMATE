package pl.derela.wszib.spotkanie4.lab14;

public class Dog2 extends Animal2{

    private static int counter;
    private static String type = "pies";

    public Dog2() {
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
