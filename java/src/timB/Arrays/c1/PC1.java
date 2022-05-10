package timB.Arrays.c1;

public class PC1 {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5};
        boolean flag = true;
        int temp;
        while(true){
            flag = false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    flag = true;
                }
            }
        }
    }

}
