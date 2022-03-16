package challenges.p1;

public class DigitsInNumber {
    public static void main(String[] args) {

        int n=12345;

        int m = n;
        while(m>0){
            //WHat does n%10 does?
            //It will display teh last digit
            //Hence, if it displays the last digit, it is better to cut it down in the next step.
            int d=m%10;
            System.out.print(d);
            //WHat does n/10 does?
            //This would cut down the last digit
            m=m/10;
        }
    }
}
