package pl.java.t3;

public class PackageTesterApp {
    public static void main(String[] args) {

        PackageTester packageTester1 = new PackageTester();
        pl.java.t1.PackageTester packageTester2 = new pl.java.t1.PackageTester();
        pl.java.t2.PackageTester packageTester3 = new pl.java.t2.PackageTester();

        packageTester1.introduce();
        packageTester2.introduce();
        packageTester3.introduce();

    }
}
