package pl.derela.wszib.spotkanie4.lab17;

public enum CardinalPoint {
    N ("północ", "north", 0),
    E("wschód", "east", 90),
    S("południe", "south",180),
    W("zachód", "west",270),
    NE("północny-wschód", "northeast",45),
    SE("południowy-wschód", "southeast",135),
    SW("południowy-zachód","southwest",225),
    NW("północny-zachód","northwest",315);

    private String namePl;
    private String nameEn;
    private int rotation;

    CardinalPoint(String namePl, String nameEn, int rotation) {
        this.namePl = namePl;
        this.nameEn = nameEn;
        this.rotation = rotation;
    }

    public String getNamePl() {
        return namePl;
    }

    public String getNameEn() {
        return nameEn;
    }

    public int getRotation() {
        return rotation;
    }
}
