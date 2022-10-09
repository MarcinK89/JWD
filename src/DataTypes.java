public class DataTypes {

    public static void main(String[] args) {
        // liczby całkowite
        // byte - 1  00000000
        // short - 2 bajty
        // int - 4 bajty
        // long - 8 bajty

        // domyślnie liczby calkowite traktowane są jako int
        System.out.println(22);
        System.out.println(222222222222222222L);

        byte b = -120;
        short s = 31678;
        int i = 1_123_456;
        long l = i * b;
        char c = 12;

        System.out.println(c);

        //liczby zmienno przecinkowe
        // float - 4
        //double - 8

        //liczby zmienno przecinkowe traktowane są jako double

        double a = 34.35;
        float f = 15.12F;
        double d = 234234234.2424234234;

        //tpy znakowy
        System.out.println('a');
        System.out.println('\'');
        System.out.println('\t');

        //typ logiczny
        System.out.println(true);
        System.out.println(false);

        boolean choosen = true;
        boolean q = false;
        System.out.println(q);

        //ciagi znaków
        String name = "ALa";
        System.out.println(name);
        System.out.println("Cześć, jestem " + name);

        System.out.println();

        System.out.println("");

        char p = 169;
        System.out.println("   " + p);
        System.out.println("  " + p + " " + p);
        System.out.println(" " + p + "   " + p);
        System.out.println(p + " " + p + " " + p + " "  + p);


    }
}
