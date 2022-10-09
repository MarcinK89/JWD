public class CharacterType {
    public static void main(String[] args) {
        showInfo('a');
        showInfo('b');
        showInfo('ą');



    }
    public static void showInfo(char c) {
        System.out.println("Kod znaku '" + c + " to: " + (int)c);

    }
}
