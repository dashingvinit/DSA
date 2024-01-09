package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '+') {
                nums.add((int) str.charAt(i) - (int) '0');
            }
        }

        int[] arr = nums.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);

        for (int j = 0; j < arr.length - 1; j++) {
            System.out.print(arr[j] + "+");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
