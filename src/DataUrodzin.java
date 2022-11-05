import java.util.StringTokenizer;

public class DataUrodzin {

    public static void main(String[] args) {

        String dataurodzin = "29/04/2016";
        StringTokenizer date;

        date = new StringTokenizer(dataurodzin, "/");
        System.out.println("Urodziny: " + dataurodzin);
        System.out.println("dzień: " + date.nextToken());
        System.out.println("miesiąc: " + date.nextToken());
        System.out.println("rok: " + date.nextToken());
    }
}
