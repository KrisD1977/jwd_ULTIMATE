package pl.derela.wszib.spotkanie4.exception;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();

        int i = ued.getNumberFromString("999d");
        if (i >0 ) {
            System.out.println("Oto nasza liczba pomnożona przez 3" + (i * 3));

        }
    }

    public int getNumberFromString (String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Coś poszło nie tak! Upewnij się , że przekazywany string jest liczbą");
        }
        return -1;
    }

}
