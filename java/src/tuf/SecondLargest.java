package tuf;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {


        int[] arr = {4,5,3,6,7};
        int[] a = {4,5,3,6,7};
        int max = arr[0];
        int smax = arr[0];
        for (int i = 0; i < arr.length; i++) {

        if(arr[i]>max){
            max = arr[i];
        }



        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max && arr[i]>smax){
                smax = arr[i];
            }
        }


        System.out.println(max);
        System.out.println(smax);
        System.out.println(getSecondOrderElements(5, a)[0]);

    }

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        int smax =Integer.MIN_VALUE;
        int[] res = new int[2];
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]>smax && a[i]!=max){
                smax=a[i];
                res[0]=smax;
            }

            if(a[i]<least){
                least=a[i];
            }
            if(a[i]!=least && a[i]<sleast){
                sleast=a[i];
                res[1]=sleast;
            }
        }
        return res;
    }


}
