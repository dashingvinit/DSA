import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = new String();
        str = "1.1.1.1";
        String ans = str.replaceAll(".", "[.]");

        System.out.println(ans);

        int[][] arr = new int[3][2];
        arr = new int[][]{{1, 2}, {3, 4}, {5, 6}};

        System.out.println(arr[0][1]);
    }
}
