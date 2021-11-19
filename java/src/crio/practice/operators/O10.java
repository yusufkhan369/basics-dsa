package crio.practice.operators;

public class O10 {
    public static void main(String[] args) {
//        Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
//        1 - first program by using a third variable
//        2 - second program without using any third variable
//        ( Swapping means interchanging the values of the two variables E.g.-
//         If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)

        int a = 6, b = 8, temp = 0;
        temp = b; //temp =8
        b=a; //b=6, a=6
        a=temp;
        System.out.println(a +" & "+b);

        int c=20, d=10;
        c=c+d; //c = 30
        d=c-d; //d = 20
        c=c-d;
        System.out.println(c +" & "+d);
    }
}
