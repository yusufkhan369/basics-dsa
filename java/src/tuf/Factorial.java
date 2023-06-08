package tuf;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(facto(n));
    }

    private static int facto(int n) {
        if(n == 1) return 1;
        int val = n;
        val *= facto(n-1);
        return val;
    }
}
