package pl.derela.wszib.spotkanie2;

public class AverageFinder {

    public static void main(String[] args) {

        System.out.println("Start ...");
        double avg = findAverage (args);
        System.out.println("Srednia to: " + avg);

    }

    private static double findAverage (String [] args) {

        double result = 0;

        for (String s : args) {
            result += Integer.parseInt(s);

        }
        result = result / args.length;
        return result;
    }
}
