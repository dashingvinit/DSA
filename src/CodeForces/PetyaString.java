package CodeForces;

import java.util.Scanner;

public class PetyaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int count = 0;
        for(int i = 0; i < str1.length(); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if(Math.abs((int)(c1-c2)) != 32 && Math.abs((int)(c1-c2)) != 0 ){
                if(c1<c2){
                    System.out.println(-1);
                }else{
                    System.out.println(1);
                }
                break;
            }
            count++;
        }
        if(count>0){
            System.out.println(0);
        }
    }
}
