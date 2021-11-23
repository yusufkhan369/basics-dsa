package crio.practice.recursion;

public class Three {
    public static void main(String[] args) {
        sumOfnNumbers(1,5,0);
    }
    public static void sumOfnNumbers(int i, int n, int sum){
        if(i==5){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumOfnNumbers(i+1,n,sum);
    }
}
