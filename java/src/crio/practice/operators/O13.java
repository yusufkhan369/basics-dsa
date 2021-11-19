package crio.practice.operators;

public class O13 {
    public static void main(String[] args) {
//        Write a program to calculate the sum of the first and the second last digit of a 5 digit.
//                E.g.- NUMBER : 12345        OUTPUT : 1+4=5
        int num = 12395;
        int firstDigit = num/10000;
        int firstThreeDigits = num/100;
        int firstFourDigits = num/10;
        int fourthDigit = firstFourDigits - (firstThreeDigits*10);
        System.out.println(fourthDigit);
        System.out.println(firstDigit+fourthDigit);
    }
}
