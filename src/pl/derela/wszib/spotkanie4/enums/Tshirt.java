package pl.derela.wszib.spotkanie4.enums;

public class Tshirt {

    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt(TshirtSize.L,"Polex");
        System.out.println("Rozmiar: " + tshirt.size);
        System.out.println("Rozmiar w klatce piersiowej: " + tshirt.size.getChestWidth());
        System.out.println("Producent:" + tshirt.manufacturer);
    }

}
