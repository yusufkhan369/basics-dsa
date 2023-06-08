package tuf;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int l = 0;
        int h = arr.length-1;
        reverseArr(arr, l, h);
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
    }

    private static void reverseArr(int[] arr, int l, int h) {
        if(l>h) return;
        swapp(l, h, arr);
        l++;
        h--;
        reverseArr(arr,l, h);
    }

    private static void swapp(int l, int h, int[] arr) {
        int i = arr[l];
        arr[l] = arr[h];
        arr[h] = i;
    }


}
