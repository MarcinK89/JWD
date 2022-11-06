public class ScopeTest {
    int test = 10;

    void printTest() {
        int test = 28;
        System.out.println("Test: " + test);
    }

    public static void main(String[] args) {
        ScopeTest sc = new ScopeTest();
        sc.printTest();
    }
}

