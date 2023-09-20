public class Recurssion {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n<1){
            return;
        }
        n--;
        print(n);
        System.out.println(n);

    }
}
