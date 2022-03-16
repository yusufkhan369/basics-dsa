package challenges.p1;

public class DetermineTheNumberOfDigits {
    public static void main(String[] args) {

        int n=1231234;
        int c=0;
        while (n>0){
            n=n/10;
            c++;
        }
        System.out.println(c);
    }
}
