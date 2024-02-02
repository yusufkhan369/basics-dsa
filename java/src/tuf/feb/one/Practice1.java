package tuf.feb.one;

public class Practice1 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(checkIfSorted(arr));;
    }

    private static boolean checkIfSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
