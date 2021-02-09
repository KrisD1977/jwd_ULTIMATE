package pl.derela.wszib.spotkanie4.powtorka.enums;

public enum Formatter {

    CALM{
        @Override
        public String format(String message) {
            return "Here is Your message." + message;
        }
    },
    NERVOUS{
        @Override
        public String format(String message) {
            return "AARGH! STOP BOTHERING ME WITH " +message + " STOP IT.";
        }
    };

    public abstract String format(String m);

}
