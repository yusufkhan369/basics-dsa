package crio.practice.ifElse;

import java.util.Scanner;

public class ie3 {
    public static void main(String[] args) {
        //A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        //Ask user for quantity
        //Suppose, one unit will cost 100.
        //Judge and print total cost for user.
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        int p = q*100;
        if(p>1000){
            System.out.println("Price: "+((p)-(p*0.1)));
        }else
        {
            System.out.println(p);
        }
    }
}
