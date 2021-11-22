package crio.practice.recursion;

public class One {
    public static void main(String[] args) {
        //Recursion
        //A function that calls itself.
        f(5);
    }
    public static void f(int i){
        if(i==0){
            return;
        }
        System.out.println(i);
        f(i-1);
    }
}
