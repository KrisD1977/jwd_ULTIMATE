package pl.derela.wszib.spotkanie4.powtorka.lab17;

public enum Computation2 {

    MULTIPLY{
        @Override
        public double perform(double x, double y) {
            return x*y;
        }
    },
    DIVIDE{
        @Override
        public double perform(double x, double y) {
            return x/y;
        }
    },
    ADD{
        @Override
        public double perform(double x, double y) {
            return x+y;
        }
    },
    SUBTRACT{
        @Override
        public double perform(double x, double y) {
            return x-y;
        }
    };

    public abstract double perform(double x, double y);
}
