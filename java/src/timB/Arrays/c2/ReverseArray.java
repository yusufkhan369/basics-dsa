package timB.Arrays.c2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
    int[] array = {1,3,5,7,9,11};
        System.out.println("Array = "+Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed Array =" +Arrays.toString(array));
    }

    private static void reverseArray(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-1];
            array[maxIndex-1]=temp;
        }
    }
}
