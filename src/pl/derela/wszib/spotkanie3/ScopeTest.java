package pl.derela.wszib.spotkanie3;

public class ScopeTest {

    int test = 10;

    void printTest () {
        int test = 20;
        System.out.println("test= " + this.test);
    }

    public static void main(String[] args) {

        ScopeTest scopeTest = new ScopeTest();
        scopeTest.printTest();
        scopeTest.test = 99;


    }
}
