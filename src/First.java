class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, n = 2;
        while (n <= 7) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(b + " ");
            n++;
        }
    }
}
