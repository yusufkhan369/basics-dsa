package challenges.p1;

public class Prime<num> {
    public static int num=19;
    public static void main(String[] args) {
        primeOrNot(num);
    }
    static boolean primeOrNot(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        System.out.println("Prime");
        return true;
    }
}
