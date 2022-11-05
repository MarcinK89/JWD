public class inwestycja {
    public static void main(String[] args) {
        int a;
        float b;
        float c;
        float d;
        a = 14000; //poczatkowa wartosc inwestycji
        b = a * 1.4f;
        c = b - 1500;
        d = c * 1.12f;



        System.out.println("Początkowa wartość inwestycji " + a + " zł");
        System.out.println("Wartość inwestycji po pierwszym roku: " + b + " zł");
        System.out.println("Wartość inwestycji po drugim roku " + c + " zł");
        System.out.println("Wartość inwestycji po trzecim roku " + d + " zł");



    }
}
