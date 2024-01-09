package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        HashMap<Character,Integer> mp = new HashMap<>();
        int count = 0;
        for(int i = 0; i <str.length(); i++){
            if(!mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),1);
                count++;
            }
        }
        if(count%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
