public class FrequentNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 5, 5, 1, 2,};
        int[] counters = new int[9];

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }

        for (int i: counters) {
            System.out.println(i);

        }

        int mostFrequent = 0;

        for (int i = 0; i < counters.length ; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }

        System.out.print("Najczęściej występującą cyfrą jest cyfra: " + mostFrequent);
        System.out.println(", wystąpiła " + counters[mostFrequent] + " razy");
    }
}
