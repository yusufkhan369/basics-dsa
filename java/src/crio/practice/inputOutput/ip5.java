package crio.practice.inputOutput;

import java.util.Scanner;

public class ip5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int side = s.nextInt();
        System.out.println("Area: "+(side*side));
        System.out.println("Perimeter: "+(side+side+side+side));
    }
}
