package crio.practice.arrays;

public class SearchAdnPrintIndex {
    public static void main(String[] args) {
        int[] arr = {11111,234,562,545,635};
        int a = 545;
        int temp = 0;
        int MAX_VALUE = Integer.MAX_VALUE;
        int MIN_VALUE = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            if(temp<=arr[1]){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
