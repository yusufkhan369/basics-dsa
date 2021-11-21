package crio.practice.ifElse;

import java.util.Scanner;

public class ie4 {
    public static void main(String[] args) {
        //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        //Ask user for their salary and year of service and print the net bonus amount.
        Scanner scanner = new Scanner(System.in);
        double sal = scanner.nextDouble();
        int yearsOfService = scanner.nextInt();
        if(yearsOfService>5){
            sal = sal+(sal*0.05);
            System.out.println(sal);
        }
    }
}
