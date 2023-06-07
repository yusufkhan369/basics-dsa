package tuf;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 12345;
        int m = 0;

        while(n!=0){

        int d = n%10;

        m = m*10+d;

        n = n/10;
        }

        System.out.println(m);
    }
}
