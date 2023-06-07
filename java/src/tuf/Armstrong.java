package tuf;

public class Armstrong {

    public static void main(String[] args) {
        int a = 153;

        System.out.println(armEquivalent(a));

    }

    static int countNumberOfDigits(int a){
        int count =0;
        while(a!=0){
            a = a/10;
            count++;

        }
        return count;
    }

    static int armEquivalent(int a){

        int c = countNumberOfDigits(a);
        int d1  = 0;
        while(a!=0)
        {
            int d = a %10;
            d1+= (int) Math.pow(d,c);
            a = a/10;
        }
        return d1;
    }
}
