package gfg;

public class Deletion {

    public static void main(String[] args) {

        int []a = {1,2,3,4,6,5};

        int []b = new int[a.length-1];

        int index = 4;

        for (int i = 0 ; i < index; i++) {
            b[i] = a[i];
        }
        for (int i = index+1; i < a.length; i++) {
            b[i-1] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
