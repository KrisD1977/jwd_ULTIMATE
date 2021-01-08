package pl.java.t1;

public class PackageTester {
    public void introduce() {
        System.out.println("To jest obiekt z pakietu:" + this.getClass().getPackageName());
    }

}
