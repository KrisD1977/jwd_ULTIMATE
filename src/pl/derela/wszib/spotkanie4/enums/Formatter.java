package pl.derela.wszib.spotkanie4.enums;

public enum Formatter {

    CALM {
        @Override
        public String format(String message) {
            return "Here is your message: " + message;
        }
    },
    NERVOUS{
        @Override
        public String format(String message) {
            return "ARGH! STOP BOTHERING ME WITH YOUR MESSAGE " + message + " I AM NOT GOING TO ACCEPT ANYTHING MORE!" ;
        }
    };

    public abstract String format (String message);


}
