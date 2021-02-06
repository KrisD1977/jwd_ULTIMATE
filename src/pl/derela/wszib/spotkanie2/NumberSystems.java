package pl.derela.wszib.spotkanie2;

public class NumberSystems {
    public static void main(String[] args) {// system dziesiętny 0,1,2,3,4,5,6,4,5,6,7,8,9
        // 154  -> (1 * 10^2) + (5 * 10^1) + (4 * 10^0)  = 100 + 50 +4 = 154

        //system binarny 0,1
        // 101 -> (1 * 2^2) + (0 * 2^1) + (1 * 2^0) = 4 + 0 + 1 = 5 ( w dziesiętnym)
        // zamiana z dziesiętnego na binarny:
        // 5 : 2 -> 1 (reszty)
        // 2 : 2 -> 0 (reszty)
        // 1 : 2 -> 1 (reszty)
        // 101 binarnie


        // system ósemkowy octalny - 0,1,2,3,4,5,6,7
        // 47 = (4 * 8^1) + (7 * 8^0) = 32 + 7 = 39 (dziesiętnie)
        // 65 : 8 = 101;

        System.out.println(Integer.toOctalString(64));

        //system szesnastkowy heksadecymalny - 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
        // 3af = (3 * 16^2) + (a (10) * 16^1) + (f (15) * 16^0) = 3 * 256 + 10 * 16 + 15 * 1 = 943

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toOctalString(39));
        System.out.println(Integer.toHexString(943));
        System.out.println(Integer.toOctalString(65));
        System.out.println(  );

        //8 4 2 1 - > 2^3   2^2  2^1 2^0
        //1 0 1 1 =>  8    + 0  + 2 + 1 = 11

        /*int a = 11; //  00000000 0000000 00000000 00001011  / po prawej najmniej znaczący bit, po lewej nahbardziej znaczący bit
        System.out.println(Integer.toBinaryString(a));*/

        // operatory bitowe
        // & - iloczyn bitowy
        // |  - suma bitowa
        // ^ - XOR  eXclusive Or
        // ~ - negacja bitowa
        // >> - przesunięcie w prawo
        // << - przesunięcie w lewo
        // >>> - przesunięcie w prawo bez znaku

        int a = 1;
        int b = 5;


        System.out.println(String.format("%32s", Integer.toBinaryString(a)));
        System.out.println("-------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println("iloczyn  bitowy---------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ', '0'));
        System.out.println("dziesiętnie:" +(a & b));
        System.out.println("");

        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println("suma bitowa----------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)).replace(' ', '0'));
        System.out.println("dziesiętnie:" +(a | b));
        System.out.println();

        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println(" XOR -----------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));
        System.out.println("dziesiętnie:" +(a ^ b));
        System.out.println();


        System.out.println("negacja bitowa: " +a);
        System.out.println(~a);
        System.out.println(String.format("%32s", Integer.toBinaryString(~a)).replace(' ', '0'));
        System.out.println();

        System.out.println("przesunięcie bitowe w lewo");
        System.out.println("dziesiętnie:" +b );
        System.out.println("przesunięta dziesiętnie:" +(b << 3));
        System.out.println("Binarnie ------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(b << 3)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));


        // ~ negacja
        // -1
        // 0001 = bierzemy 1, zmieany bity na przeciwne i dodajemy 1,
        // 1110  +1;
        //-------
        // 1111


    }
}
