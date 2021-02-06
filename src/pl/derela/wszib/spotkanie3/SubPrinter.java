package pl.derela.wszib.spotkanie3;

public class SubPrinter extends Printer{

    int z = 3;

    public static void main(String[] args) {

        SubPrinter subPrinter = new SubPrinter();
        subPrinter.x = 7;
        subPrinter.printMe();
    }

    void printMe() {
        System.out.println("X wynosi: " + x + ", Y wynosi: " + y+ ", Z wynosi: " + z);
        System.out.println("Jestem egzemplarzem klasy: " + this.getClass().getName());

    }

}
