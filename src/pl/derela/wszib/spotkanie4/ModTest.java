package pl.derela.wszib.spotkanie4;

public class ModTest /*extends String      // jest klasą final */ {

    public static final int A = 5;

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.modeForSensitiveClothes();


    }

    static synchronized protected final void specialMethod() {
    }
}
