package crio.practice.inputOutput;

import java.util.Scanner;

public class ip8 {
    public static void main(String[] args) {
        //Take 3 inputs from user and check :
        //all are equal
        //any of two are equal
        //( use && || )

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(a==b&&b==c&&c==a);
        System.out.println(a==b||b==c||c==a);
    }
}
