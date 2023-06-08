package tuf;

public class SumOfFirstN {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOfN(n));

    }

    private static int sumOfN(int n) {

        if(n==0) return 0;
        int val = n;
        val += sumOfN(n-1);
        return val;
    }
}
