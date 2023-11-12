package tuf;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,5,6,6,7,7,7,7};
        int count  = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]!=arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
