package crio.practice.loops;

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=0,sum=0;
        for(int i =1; i<=10; i++){
            System.out.println("Enter number "+i+":");
            a += s.nextInt();
        }
        System.out.println(a);
    }
}
