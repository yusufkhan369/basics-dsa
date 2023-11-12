package tuf;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1,22,24,33,42,1};

        System.out.println(checking(arr));
    }

    private static boolean checking(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
