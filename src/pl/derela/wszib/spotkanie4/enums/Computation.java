package pl.derela.wszib.spotkanie4.enums;

public enum Computation {
    MULTIPLY
            {
                @Override
                public double perform(double x, double y) {
                    return x * y;
                }
            },
   DIVIDE {
       @Override
       public double perform(double x, double y) {
           return x/y;
       }
   }
    ,
    ADD{
        @Override
        public double perform(double x, double y) {
            return x+y;
        }
    },
    SUBTRACT {
        @Override
        public double perform(double x, double y) {
            return x-y;
        }
    };


    double x;
    double y;

    public abstract double perform ( double x,double y );
}

class Calculus {
    public static void main(String[] args) {
        System.out.println("Mnożenie: "  +Computation.MULTIPLY.perform(1,-4));
        System.out.println("Dodawanie: "  +Computation.ADD.perform(1,-4));
        System.out.println("Dzielenie: "  +Computation.DIVIDE.perform(1,-4));
        System.out.println("Odejmowanie: "  +Computation.SUBTRACT.perform(1,-4));
    }

}
