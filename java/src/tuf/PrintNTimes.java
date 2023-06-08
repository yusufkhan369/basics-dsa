package tuf;

public class PrintNTimes {
    public static void main(String[] args) {
        int n =5;
        printNTimes(n);
    }

    private static void printNTimes(int n) {
        if(n==0) return;
        n--;
        System.out.println("Printing N times");
        printNTimes(n);
    }
}
