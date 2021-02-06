package pl.derela.wszib.spotkanie1;

public class Objects2   {

    public static void main(String[] args) {

        int firstPrize = 173;
        Integer secondPrize = 234;

        int higherPrize = Math.max(firstPrize,secondPrize);

        System.out.println("Wyższa nagroda to :" + higherPrize);


        int accountBalance = 15_005;
        System.out.printf("Saldo: %,d zł%n",accountBalance );

        // s - Strings
        // d  - decimal int
        // f - floating
        // n - new line
        // t - date/time
        //bB - boolean

        double pi = Math.PI;
        System.out.printf("%.4f%n", pi);


    }
}
