package pl.derela.wszib.spotkanie4.powtorka.exception;

public class ExceptionThrowDemo {

    public static void main(String[] args) {
        ExceptionThrowDemo etd = new ExceptionThrowDemo();

        try {
            System.out.println(etd.getNumberOfSeconds(-8));
        } catch (IllegalArgumentException e) {
            System.out.println("Popraw -");
        }


    }
    public int getNumberOfSeconds (int hours) {

        if (hours<0) {
            throw new IllegalArgumentException("hours must be >= 0:" +hours);
         }

        return hours*3600;
    }
}
