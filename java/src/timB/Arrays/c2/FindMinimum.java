package timB.Arrays.c2;

import java.util.Scanner;

public class FindMinimum {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ENter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);
        System.out.println(findMin(returnedArray));
    }
    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i]=number;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}

