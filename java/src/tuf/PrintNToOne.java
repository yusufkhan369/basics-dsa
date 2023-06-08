package tuf;

public class PrintNToOne {
    public static void main(String[] args) {
        int n = 5;
        printNToOne(n);
    }

    private static void printNToOne(int n) {
        if(n==0) return;

        System.out.println(n);
        n--;
        printNToOne(n);
    }
}
