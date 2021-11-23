package crio.programmingconstructs;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3,4,5};
        int[] result = digits;
        result[digits.length-1] = result[digits.length-1]+1;
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
