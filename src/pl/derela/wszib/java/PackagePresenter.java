package pl.derela.wszib.java;

public class PackagePresenter {
    public PackagePresenter() {
        System.out.println("Dzień dobry !!! ");
    }

    public static void main(String[] args) {
        PackagePresenter packagePresenter = new PackagePresenter();
        packagePresenter.showPackage ();

    }
    public void showPackage () {
        System.out.println("To jest obiekt klasy:" +this.getClass().getName());
        System.out.println(", w pakiecie " +getClass().getPackageName());
    }

}
