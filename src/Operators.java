public class Operators {
    public static void main(String[] args) {
        int x = 5;
        x = x + 2;
        int y = 4;

        System.out.println(x / y); //uwaga wynik calkowity, poniewaz operandy sa int czyli calkowite
        System.out.println(x / (double)y); //rzutowane, traktowanie y jako double, zmienno przecinkowa liczba, wynik bedzie podany z przecinkiem
        System.out.println(3 / 2.); //tez poda po przecinku wynik

        System.out.println(5 % 2); //modulo - ile jest reszty z dzielenia

        int a = 5;
        int b = -a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("NEXT");


        int e, f, g;
        e = 42;
        f = e++; //f=42, e=43
        g = ++e; //x=44, g=44
        System.out.println(f);
        System.out.println(g);

        int h = 0;
        int i;

        i = h++ + h++; // (0) + (1) i = 1; h = 2;
        System.out.println("h = " + h);
        System.out.println("i = " + i);

        int j = 0;

        j = j++;

        System.out.println("j = " + j);

        // int k = 7;
        // int l = 7;
        // int m = 7;

        int k, l, m; // to samo co wyzej, to samo tyczy sie odejmowania, dzielenia
        k = l = m = 7;

        System.out.println(k);

        //operatory relacji
        //megacja !
        // iloczyn logiczny, koniunkcka &&
        //suma logiczna ||
        //rownoważność ==
        //alternatywa rozlaczna XOR !=

        // && oraz || to operatory warunkowe w przeciwiesntwie do & i |

        int o = 0;
        int p = 5;
        boolean test = (o > p) && (p++ > 3); //false && true //false - pierwszy czlon jest wykonywany, ale drugi juz nie, gdy pierwszy da false to drugi juz nie jest rozstrzygany

        System.out.println(test);
        System.out.println(p);

        //operator negacji

        System.out.println("NEXT");

        int age = 33;
        boolean test2 = !(age < 25 ); // negujemy false otrzymujemy true

        System.out.println(test2);



    }
}
