package pl.derela.wszib.spotkanie4.lab17;

public enum Computation {
    ADD {
        @Override
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        public double perform(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public double perform(double x, double y) {
            return x / y;
        }
    };

    public abstract double perform (double x, double y);
}
