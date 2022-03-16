package kunal.kush.io;

import java.util.Scanner;

public class lit {
    int a =10;
    //The above 'a' is an identifier
    int b = 234_000_000;
    //Type conversion
    static Scanner s = new Scanner(System.in);
    static float number = s.nextFloat();

    public static void main(String[] args) {
        System.out.println(number);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i=50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d-s);

    }
}
