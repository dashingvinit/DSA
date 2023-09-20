public class Experiment3 {

    static void pow(int x, int y) {
        int pow = 1;
        for (int i = 0; i < y; i++) {
            pow = pow * x;
        }
        System.out.println("Exp:2 " + x + " power " + y + ": " + pow);
    }

    static void frequency(int[] arr, int n) {
        int[] fr = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        System.out.println("Exp:3 Element: Frequency");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println("    " + arr[i] + ": " + fr[i]);
        }

    }

    public static void main(String[] args) {
        System.out.println("Vinit Jain");
        int[] arr = new int[]{5, 5, 2, 4, 1, 2, 3, 2, 1};
        pow(2, 4);
        frequency(arr, arr.length);
    }
}
