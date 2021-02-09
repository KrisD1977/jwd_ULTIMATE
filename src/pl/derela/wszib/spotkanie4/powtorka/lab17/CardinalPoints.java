package pl.derela.wszib.spotkanie4.powtorka.lab17;

public enum CardinalPoints {
    N("N","Północ", "North"),
    NE("NE","Północny-wschód","Northeast"),
    E("E","Wschód","East"),
    SE("SE","Południowy-wschód","Southeast"),
    S("S","Południe","South"),
    SW("SW","Południowy-wschód","Southwest"),
    W("W","Zachód","West"),
    NW("NW","Północny-zachód","Northwest");

    private String name;
    private String nameInPolish;
    private String nameInEnglish;

    CardinalPoints(String name, String nameInPolish, String nameInEnglish) {
        this.name = name;
        this.nameInPolish = nameInPolish;
        this.nameInEnglish = nameInEnglish;
    }

    public String getName() {
        return name;
    }

    public String getNameInPolish() {
        return nameInPolish;
    }

    public String getNameInEnglish() {
        return nameInEnglish;
    }
}
