package crio.programmingconstructs;

public class PatternOne {
    public static void main(String[] args) {
        System.out.println("Start of the pattern printing:");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
