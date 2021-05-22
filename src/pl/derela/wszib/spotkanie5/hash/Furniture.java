package pl.derela.wszib.spotkanie5.hash;

public class Furniture {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Janige", "IKEA", 2016);
        Chair chair3 = new Chair("Adde", "IKEA", 2015);
        Chair chair4 = new Chair("Adde", "IKEA", 2016);

        System.out.println(chair1);
        System.out.println(chair4);

        System.out.println(chair1.equals(chair4));

        System.out.println(chair1.hashCode());
        System.out.println(chair4.hashCode());


    }
}
