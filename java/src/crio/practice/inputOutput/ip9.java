package crio.practice.inputOutput;

import java.util.Scanner;

public class ip9 {
    public static void main(String[] args) {
        //Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check
        //if both the conditions 'a < 50' and 'a < b' are true.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=s.nextInt();

        System.out.println(a<50&&a<b);
    }
}
