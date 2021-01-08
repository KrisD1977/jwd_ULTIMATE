package pl.derela.wszib.test;

class ScopeTest {
    int test;
    void printTest() {
                System.out.println("Test: " + test);
    }
    public static void main(String[] args) {
        ScopeTest st = new ScopeTest();
        st.test = 15;
        st.printTest();
    }
}
