package gfg;

public class IsArraySorted {

    public static void main(String[] args) {

        int []a = {1,2,3,4,5,6,5};

        for (int i = 1; i < a.length; i++) {
            if(a[i-1]<a[i]){
                continue;
            }
            else {
                System.out.println(false);
            }
        }

    }
}
