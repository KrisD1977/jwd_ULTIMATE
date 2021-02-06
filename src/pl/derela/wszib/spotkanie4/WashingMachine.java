package pl.derela.wszib.spotkanie4;

public class WashingMachine {

    private int temperature;
    private int spinning;

    public void modeForSensitiveClothes () {
        temperature = 30;
        spinning = 800;
    }

    public void modeForTowelsAndBedLinen () {
        temperature = 90;
        spinning = 1200;
    }



}
