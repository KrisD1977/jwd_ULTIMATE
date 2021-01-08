package pl.derela.wszib.podyplomowe;

public class PackagePresenter {
    public void showPackage() {

        System.out.println("To jest obiekt klasy:" +this.getClass().getName());
        System.out.println(", w pakiecie " +getClass().getPackageName());
    }


}
