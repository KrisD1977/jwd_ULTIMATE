package pl.derela.wszib.spotkanie4;

public class Rectangle extends Shape{

    private int lenght;
    private int width;

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle() {
    }

    @Override
    double getArea() {
        return lenght * width;
    }


    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.width = 10;
        r.lenght= 5;

        Rectangle r2 = new Rectangle(5,5);

        System.out.println("pole: " + r.getArea() + ", a kolor to: " +r.color);
        System.out.println("pole: " + r2.getArea() + ", a kolor to: " +r2.color);
    }
}
