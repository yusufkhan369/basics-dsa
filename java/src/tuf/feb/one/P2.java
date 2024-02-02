package tuf.feb.one;

public class P2 {
    public static void main(String[] args) {
        int[] a = {1,1,0,1,1,1,0,0,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,0,1};
        int count=0, max = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                count++;
            }else {
                max = Math.max(max,count);
                count = 0;
            }
        }
        System.out.println(max);
    }
}
