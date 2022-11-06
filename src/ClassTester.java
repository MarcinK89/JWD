import javax.management.MBeanAttributeInfo;

public class ClassTester {

        static int j = 2; // zmienna klasowa (pole statyczne)
    int i; // zmienna egzemplarza (pole klasy)

    public int change() {
        int k = 7; //zmienna lokalna
        return i + (k * j);

    }


}


