package pl.derela.wszib.spotkanie1.lab5;

public class Investor {

    public static void main(String[] args) {

        float total = 14_000;

        System.out.println("Inwestycja początkowa: " + total + " zł.");
        total = total + (total * .4F);
        System.out.println("Po pierwszym roku: " + total);
        total = total - 1_500;
        System.out.println("Po dwóch latach: " + total);
        total = total + (total * .12F);
        System.out.println("Po trzech latach: " + total);
    }
}
