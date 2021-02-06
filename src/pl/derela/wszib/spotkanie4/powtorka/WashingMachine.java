package pl.derela.wszib.spotkanie4.powtorka;

public class WashingMachine {

    public void setTemperature(int temperature) {
        if (temperature <= 90) {
        this.temperature = temperature;
        } else if (temperature >90) {
            this.temperature = 30;
            System.out.println("Podano za duża temeperatura, ustawiono na 30");
        }
    }

    public void setSpinning(int spinning) {
        this.spinning = spinning;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getSpinning() {
        return spinning;
    }

    private int temperature;
    private int spinning;

    public void modeForSensitivClothes () {

        temperature = 30;
        spinning = 400;

    }

    public void modeForTowelAndBedlinen () {

        temperature = 90;
        spinning = 1200;

    }


}
