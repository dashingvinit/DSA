package CodeForces;

import java.util.Scanner;

public class BeautiMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] m = new int[5][5];
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = scan.nextInt();
            }
        }
        int x=0,y =0;
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(m[i][j] == 1){
                    x = i + 1;
                    y = j + 1;
                    break;
                }
            }
        }
        System.out.println(Math.abs((x - 3)) + Math.abs((y-3)));
    }
}
