package pl.derela.wszib.spotkanie2.lab7;

public class BinConverter {

    public static void main(String[] args) {

        String binary = "1101";
        Long result = 0L;

        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            int bit = Character.getNumericValue(c);
            /*int bit = Integer.parseInt(String.valueOf(binary.charAt(i)));*/
            int revIndex = binary.length() - i -1;
           /* System.out.println("i: " + i + " wartość= " + bit + " revIndex " + revIndex);*/

            result += bit * (long)Math.pow(2,revIndex);

        }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie.");
    }
}
