package pl.derela.wszib.spotkanie4.powtorka.other;

public class Rectangle extends Shape{

    private int lenght;
    private int width;


    @Override
    double getArea() {
        return lenght * width;
    }
}
