package tuf;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 1212;
        int n1 = n;
        int m = 0;
        while(n!=0){

            int dis = n%10;

            m = m*10+dis;

            n = n/10;

        }

        if(n1 == m) {
            System.out.println("true");
        }
    }
}
