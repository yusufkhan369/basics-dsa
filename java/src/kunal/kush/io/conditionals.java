package kunal.kush.io;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,max = 10;
        int b = 20;
        int c = 30;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);

    }
}
