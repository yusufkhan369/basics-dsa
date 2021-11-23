package crio.programmingconstructs;

public class MulFizzBuzz {
    public static void main(String[] args) {

        String[] str=fizzbuzz(15);
        for (int i=0;i< str.length;i++){
            System.out.println(str[i]);
        }

    }
    public static String[] fizzbuzz(int n){
        String[] str = new String[15];
        for(int i=1;i<=n;i++){
            str[i-1]=Integer.toString(i);
            if(i%3==0){
                str[i-1]="Fizz";
            }
            if(i%5==0){
                str[i-1]="Buzz";
            }
            if(i%3==0&&i%5==0){
                str[i-1] = "FizzBuzz";
            }
        }

        return str;
    }
}
