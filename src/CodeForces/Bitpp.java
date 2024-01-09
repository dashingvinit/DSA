package CodeForces;

import java.util.Scanner;

public class Bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n-- > 0){
            String str = sc.next();
            if(str.equals("++X") || str.equals("X++")){
                count++;
            } else if(str.equals("--X") || str.equals("X--")){
                count--;
            }
        }
        System.out.println(count);
    }
}
