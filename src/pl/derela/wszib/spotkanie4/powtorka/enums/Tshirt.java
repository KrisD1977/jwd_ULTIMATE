package pl.derela.wszib.spotkanie4.powtorka.enums;

public class Tshirt {
    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt(TshirtSize.S,"Nike");
        System.out.println("Rozmiar koszulki: " +tshirt.size);
        System.out.println("Producent: " +tshirt.manufacturer);

    }
}
