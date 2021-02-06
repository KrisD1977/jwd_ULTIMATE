package pl.derela.wszib.spotkanie3;

public class Shop {

    public static void main(String[] args) {

        Product product1 = new Product("Milk", 2.5);
        Product product2 = new Product("Milk", 2);

        System.out.println(product1==product2);
        System.out.println(product1.equals(product2));

    }
}
