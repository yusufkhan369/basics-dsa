package challenges.p1;

import java.util.ArrayList;
import java.util.List;

public class Chall1b {
    public static void main(String[] args) {
        calcSumAndCountAllNumbersDivBy_2_Or_7(3);
    }

    public static void calcSumAndCountAllNumbersDivBy_2_Or_7(int a){
        List<Integer> by2 = new ArrayList<>();
        List<Integer> by7 = new ArrayList<>();
        int count =0;
        for(int i = 1; i<=a; i++){
            if(a%2 == 0) {
                by2.add(i);
                count++;
            }
            if(a%7==0) {
                by7.add(i);
                count++;
            }
        }


    }
}
