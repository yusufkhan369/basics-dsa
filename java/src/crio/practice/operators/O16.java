package crio.practice.operators;

public class O16 {
    public static void main(String[] args) {
        int n = 369;
        int f = n/100;
        System.out.println(n/100); //3
        n=n%100;
        int n1 =n%10;
        n=n/10;
        int s =n;
        System.out.println(n); //6
        int t =n1;
        System.out.println(n1); //9
        System.out.println((t*100)+(s*10)+(f));
    }
}
