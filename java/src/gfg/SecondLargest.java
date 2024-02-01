package gfg;

public class SecondLargest {


    public static void main(String[] args) {
        int []arr = {12,3,45,6,76,78,90,3,1};

        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > l){
                sl = l;
                l = arr[i];
            } else if (arr[i]>sl && arr[i]!=l) {
                sl = arr[i];
            }


        }
        System.out.println(sl);

    }

}
