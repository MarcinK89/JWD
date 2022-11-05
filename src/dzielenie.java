public class dzielenie {
    public static void main(String[] args) {
        int a = 10;
        boolean result = (a % 5) == 0 && (a % 7) == 0;

        System.out.println("Czy liczba " + a + " dzieli sie przez 5 i 7 jednocześnie? - " + result);

    }
}
