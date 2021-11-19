package crio.practice.operators;

public class O3 {
    public static void main(String[] args) {
        //Write a program to add 8 to the number 2345 and then divide it by 3.
        // Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
        int res = 0;
        int num = (8+2345)/3;
        res = num%5;
        res = res*5;
        System.out.println(res);
    }
}
