package crio.practice.inputOutput;

import java.util.Scanner;

public class ip10 {
    public static void main(String[] args) {
        //If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
        // write a program to calculate his total marks and percentage marks.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Total: "+(a+b+c));
        System.out.println("Percentage: "+((a+b+c)/3));
    }
}
