package crio.practice.loops;

public class SquarePattern {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++){
            for (int j =1; j<=9;j++){
                if(i==1||j==1||i==10||j==9) {
                    System.out.print("X ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
