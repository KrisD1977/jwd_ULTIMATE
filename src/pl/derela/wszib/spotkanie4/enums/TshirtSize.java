package pl.derela.wszib.spotkanie4.enums;

public enum TshirtSize {
    S(48,71,36),
    M(52,74,38),
    L(56,76,41),
    XL(61,79,41);

    private int chestWidth;
    private int shirtLenght;
    private int sleeveLenght;

    TshirtSize(int chestWidth, int shirtLenght, int sleeveLenght) {
        this.chestWidth = chestWidth;
        this.shirtLenght = shirtLenght;
        this.sleeveLenght = sleeveLenght;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtLenght() {
        return shirtLenght;
    }

    public int getSleeveLenght() {
        return sleeveLenght;
    }
}
