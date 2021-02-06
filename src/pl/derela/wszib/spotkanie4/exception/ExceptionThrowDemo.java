package pl.derela.wszib.spotkanie4.exception;

public class ExceptionThrowDemo {

    public static void main(String[] args) {

        ExceptionThrowDemo etd = new ExceptionThrowDemo();
        int hour = -2;
        int numberOfSeconds;


        try {
            numberOfSeconds = etd.getNumberOfSeconds(hour);
        } catch (Exception e) {
            numberOfSeconds = etd.getNumberOfSeconds(hour * -1);
        }


        System.out.println(numberOfSeconds);


    }

    public int getNumberOfSeconds (int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >=0:" + hour);
        }
        return hour * 60 * 60 ;
    }
}
