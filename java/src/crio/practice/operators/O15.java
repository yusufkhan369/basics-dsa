package crio.practice.operators;

public class O15 {
    public static void main(String[] args) {
        //Write a program to calculate the sum of the digits of a 3-digit number.
        int n = 6789;
        int n1 = n/1000;
        System.out.println(n/1000);
        n=n%1000;
        int n2=n/100;
        System.out.println(n/100);
        n=n%100;
        int n3=n/10;
        System.out.println(n/10);
        int n4 = n%10;
        System.out.println(n%10);
        System.out.println(n1+n2+n3+n4);
    }
}
