public class NumberSystems {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;

        // XOR

        // 1 1 -> 0
        // 0 1 -> 1
        // 0 1 -> 1
        // 0 0 -> 0

        System.out.println();
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ','0'));




    }
}
