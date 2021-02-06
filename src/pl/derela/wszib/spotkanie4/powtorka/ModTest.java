package pl.derela.wszib.spotkanie4.powtorka;

public class ModTest {

    public static final   int A = 6;

    public static void main(String[] args) {
   /*     System.out.println( A);*/

        WashingMachine washingMachine = new WashingMachine();
       /* washingMachine.temperature = 1000;  //nie da się bo prywatne
        washingMachine.spinning = 300;  //nie da się bo prywatne*/



        washingMachine.modeForSensitivClothes();
        System.out.println("Sensitive");
        System.out.println(washingMachine.getTemperature());
        System.out.println(washingMachine.getSpinning());

        washingMachine.modeForTowelAndBedlinen();
        System.out.println("Bedlinen");
        System.out.println(washingMachine.getTemperature());
        System.out.println(washingMachine.getSpinning());

        System.out.println("UserMode settery");
        washingMachine.setSpinning(1000);
        washingMachine.setTemperature(100);
        System.out.println(washingMachine.getTemperature());
        System.out.println(washingMachine.getSpinning());




    }

    static synchronized protected final void specialMethod () {

    }
}
