package gfg;

import java.util.Arrays;

public class RemoveDupesFromSorted {

    public static void main(String[] args) {
        int []a = {1,2,3,4,5,5,6,6,6,6,6,7,7,7,7};

        int i = 0;

        for (int j = 1; j < a.length; j++) {
            if(a[i] != a[j]){
                a[i+1] = a[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
