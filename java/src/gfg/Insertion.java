package gfg;

public class Insertion {

    public static void main(String[] args) {
        int []aarr = new int[4];
//        System.out.println(aarr.length);
        aarr = new int[]{1, 2,4, 5};
//        System.out.println(aarr.length);
        int element = 3;
        int index = 2;
        int [] array2 = new int[aarr.length+1];
        for (int i = 0; i <= index; i++) {
            if(i == index){
                array2[index] = element;
            }else{
                array2[i] = aarr[i];
            }
        }
        for (int i = index+1; i < array2.length; i++) {
            array2[i] = aarr[i-1];
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println(array2.length);
    }

}
