package tuf;

public class PrintAllDivisors {

    public static void main(String[] args) {
        int abc = 12;
        printDiv(abc);
    }

    private static void printDiv(int abc) {
        for (int i = 1; i <= abc; i++) {
            if(abc % i == 0){
                System.out.println(i);
            }
        }
    }

}
