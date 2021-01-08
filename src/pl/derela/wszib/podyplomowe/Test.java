package pl.derela.wszib.podyplomowe;

public class Test   {
    public static void main(String[] args) {
        System.out.println("Pakiet: " + Test.class.getPackage());

        pl.derela.wszib.java.PackagePresenter javaPackagePresenter =
                new pl.derela.wszib.java.PackagePresenter ();

        pl.derela.wszib.podyplomowe.PackagePresenter podyplomowePackagePresenter =
                new pl.derela.wszib.podyplomowe.PackagePresenter ();

        javaPackagePresenter.showPackage();
        podyplomowePackagePresenter.showPackage();
    }
}
