import java.util.Arrays;
import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Var(1, 2, 3, 4, 5, 5, 6);
        selectionSort(arr, arr.length);
    }

    static void Var(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
