package crio.practice.recursion;

public class Two {
    public static void main(String[] args) {
        f(1);
    }
    public static void f(int i){
        if(i>5){
            return;
        }
        System.out.println(i);
        f(i+1);
    }
}
