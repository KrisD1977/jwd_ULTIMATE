package pl.derela.wszib.spotkanie2.lab7;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {

        if (!(args.length > 0)) {
            System.out.println(" Nie podano argumentów !!!");
            System.exit(-1);
        }
        String number = args[0];
        int[] signs = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            signs[i] = Character.getNumericValue(number.charAt(i));
            if (!((signs[i] == 0) || (signs[i] == 1))) {
                System.out.println("Podano niewłaściwą liczbę");
                System.exit(-1);

            } else  {


            }
        }


        BinaryConverter bin = new BinaryConverter();
        bin.showNumber(number);


        /*bin.showNumber("11");
        System.out.println();
        bin.showNumber("1010101010101011");
        System.out.println();
        bin.showNumber("1110000110000101100101000000");
        System.out.println();
        bin.showNumber("1101");
        System.out.println();
        bin.showNumber("11111111");*/


    }

    public long binConverter(String number) {
        long c = 0;

        int[] binary = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            binary[i] = Character.getNumericValue(number.charAt(i));
           /*
           binary [i] = number.charAt(i);
           if (binary [i] == 49 ) { binary [i] = 1;
                    } else { binary [i] = 0; }}
        for (int i = 0; i < binary.length; i++) {*/

            c = (long) (c + binary[i] * Math.pow(2, number.length() - 1 - i));
        }
        return c;
    }

    int showNumber(String number) {
        System.out.println("binary    ---->      decimal");
        System.out.println(number + "  ---->     " + binConverter(number));
        return 0;
    }
}
