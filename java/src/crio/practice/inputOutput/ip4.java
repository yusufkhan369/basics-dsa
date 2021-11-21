package crio.practice.inputOutput;

import java.util.Scanner;

public class ip4 {
    public static void main(String[] args) {
        //Take name, roll number and field of interest from user and print in the format below :
        //Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

        Scanner s = new Scanner(System.in);
        String name  = s.nextLine();
        int rollNo = s.nextInt();
        s.next();
        String fieldOfInterest = s.nextLine();

        System.out.println("Hey, my name is "+name+" and my roll number is "+rollNo+". My field of interest are "+fieldOfInterest);
    }
}
