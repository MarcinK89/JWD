public class ConvTester {
    public static void main(String[] args) {
        short firstPrice = 234;
        short secondPrice = 178;

        System.out.println(Math.max(firstPrice, secondPrice));

        byte a = 7;
        short b;
        int c;

        c = a; //konwersja niejawna
        b = (short)c; //rzutowanie czyli konwersja jawna

        int d = 5;
        double e = 13.5;
        double f = d / e;



    }
}
