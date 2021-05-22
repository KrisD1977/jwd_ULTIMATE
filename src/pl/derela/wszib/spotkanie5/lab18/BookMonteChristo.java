package pl.derela.wszib.spotkanie5.lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BookMonteChristo {

    public static void main(String[] args) {
        BookMonteChristo mc = new BookMonteChristo();
//        System.out.println(System.getProperty("user.dir"));
        List<String> allLines = mc.loadTextFile("crsto10.txt");

        System.out.println("Wczytano linii: " + mc.countLines(allLines));
        mc.showEveryHundredLine(allLines);
        mc.showLongestVerse(allLines);
    }

    private List<String> loadTextFile(String textFilePath) {
        try {
            return Files.readAllLines(Paths.get(textFilePath));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku");
            /*e.printStackTrace();*/
        }
        return null;
    }

    private int countLines(List list) {
        return list.size();
    }

    private void showEveryHundredLine(List list) {
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if (i % 100 == 0) {
                System.out.println(i + " " + list.get(i));
            }
        }
        ;
    }

    private void showLongestVerse(List<String> list) {
        System.out.println();
        String longestLine = "";

        for (String line : list) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        System.out.println("Majdłuższy wers w książce zawiera: " +longestLine.length() + " znaków. " +longestLine.toUpperCase() );
    }

}
