package crio.practice.recursion;

public class CalcFact {
    public static void main(String[] args) {
        System.out.println(calcFactorial(5));

    }
    public static int calcFactorial(int n){
        if(n==0||n==0){
            return 1;
        }
        int f = calcFactorial(n-1);
        int far = n*f;
        return far;
    }
}
