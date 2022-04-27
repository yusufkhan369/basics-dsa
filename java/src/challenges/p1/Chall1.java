package challenges.p1;

public class Chall1 {
    public static void main(String[] args) {
        System.out.println(calc(3,4));

    }

    public static int calc(int a, int b){
        int c = a*b;
        int d = c/2;
        int e = d%7;
        return e;
    }
}
