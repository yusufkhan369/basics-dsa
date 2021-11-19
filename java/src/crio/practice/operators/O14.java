package crio.practice.operators;

public class O14 {
    public static void main(String[] args) {
//        Take a 4-digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
//                For example, if the number which was taken is 5696, then the displayed number should be 7818.
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
