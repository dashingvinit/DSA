package CodeForces;

import java.util.Scanner;

public class TooLong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n-- > 0){
            String input = scan.next();
            int length = input.length();
            if(input.length() > 10){
                System.out.println("" + input.charAt(0) + (length-2) + input.charAt(length-1));
            }else{
                System.out.println(input);
            }
        }
    }
}
