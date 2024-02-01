package gfg;

public class Reverse {

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int []arr2 = {1,2,3,4,5};

        int low = 0;
        int high = arr.length-1;

        while(low<high){
            int left = arr[low];
            int right = arr[high];
            arr[low] = right;
            arr[high] = left;
            low++;
            high--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
