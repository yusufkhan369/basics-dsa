package tuf;

public class GcdOrHcf {
    public static void main(String[] args) {

        System.out.println(gcd(4,8));

    }

    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
       return  gcd(b, a%b);
    }
}
