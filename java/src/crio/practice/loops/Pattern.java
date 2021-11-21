package crio.practice.loops;

public class Pattern {
    public static void main(String[] args) {
        for (int i =0;i<=4;i++){
            System.out.println("X");
        }
        for (int i=0; i<=10;i++){
            System.out.print("X");
        }
        for (int i = 1;i<=4;i++){
            for (int j =0; j<=4;j++){
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
