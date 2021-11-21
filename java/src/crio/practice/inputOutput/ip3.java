package crio.practice.inputOutput;

import java.util.Scanner;

public class ip3 {
    public static void main(String[] args) {
        //3.
        //Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println((int) (a*b));
    }
}
