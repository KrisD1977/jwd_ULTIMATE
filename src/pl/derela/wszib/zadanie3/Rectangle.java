package pl.derela.wszib.zadanie3;

public class Rectangle {
    int height;
    int width;

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height) {
        this.height = height;
        this.width = height;
    }

    public int  areaRectangle () {
        int c = height * width;
        return c;
    }

    public static void main(String[] args) {

       Rectangle rectangle = new Rectangle();
        System.out.println("Pole powierzchni prostokąta o bokach  '0' wynosi: " + rectangle.areaRectangle());

        Rectangle rectangle2 = new Rectangle(2);
        System.out.println("Pole powierzchni prostokąta (kwadratu) o boku " + rectangle2.height +" wynosi: " + rectangle2.areaRectangle());

        Rectangle rectangle3 = new Rectangle(2,3);
        System.out.println("Pole powierzchni prostokąta o bokach " + rectangle3.width +" oraz " + rectangle3.height + " wynosi: " + rectangle3.areaRectangle());

    }

}
