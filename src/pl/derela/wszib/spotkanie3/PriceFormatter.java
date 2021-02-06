package pl.derela.wszib.spotkanie3;

public class PriceFormatter {
/*
    static String currency = "zł";

    private static String formatPrice(int value) {
        return String.format("%d,00 %s",value,currency);

    }
     private static String formatPrice(double value) {
        return String.format("%.2f %s",value,currency);

    }

    public static void main(String[] args) {
        System.out.println(formatPrice(2));
        System.out.println(formatPrice(29.87));


    }*/


     String currency = "zł";

    private  String formatPrice(int value) {
        return String.format("%d,00 %s",value,currency);

    }
     private String formatPrice(double value) {
        return String.format("%.2f %s",value,currency);

    }
    private String formatPrice(String value) {
        return String.format("%.2f %s",Double.parseDouble(value),currency);

    }

    public static void main(String[] args) {

        PriceFormatter priceFormatter = new PriceFormatter();
        priceFormatter.currency = "PLN";

        System.out.println(priceFormatter.formatPrice(3));
        System.out.println(priceFormatter.formatPrice(3.45));
        System.out.println(priceFormatter.formatPrice("6.66"));


    }

}
