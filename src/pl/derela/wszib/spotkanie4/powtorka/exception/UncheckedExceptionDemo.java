package pl.derela.wszib.spotkanie4.powtorka.exception;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {


        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
        int i = ued.getNumberFromString("99d");
        if (i >0) {
            System.out.println("Nasza liczba *3: " + i * 3);
        }


    }

    public int getNumberFromString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Coś poszło nie tak, upewnij się, że przekazywany String jest liczbą.");
        }
        return -1;
    }
}