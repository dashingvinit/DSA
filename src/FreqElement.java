import java.util.HashMap;
import java.util.Scanner;

public class FreqElement {
    static void freCount(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (visited[i]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Count of element " + arr[i] + " is " + count);
        }
    }

    static void freqCountHash(int[] arr) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < arr.length; i++ ){
            int key = arr[i];
            int frequency = 0;

            if (freq.containsKey(key))
                frequency = freq.get(key);

            frequency++;

            freq.put(key, frequency);
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            // fetch:
            if (freq.containsKey(number)) System.out.println(freq.get(number));
            else System.out.println(0);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2, 3, 4, 6, 5, 4, 4, 5, 6, 1};
        // freCount(arr);
        freqCountHash(arr);
    }
}
