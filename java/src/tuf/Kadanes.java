package tuf;

public class Kadanes {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(arr[j]);
            }
        }
    }

}
