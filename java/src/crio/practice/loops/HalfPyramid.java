package crio.practice.loops;

public class HalfPyramid {
    public static void main(String[] args) {

        for (int i =1;i<=4;i++){
            for(int j= 1;j<= 4-i;j++){
                System.out.print(" ");
            }
            for (int j =1; j<=i;j++){
                System.out.print("X");
            }
            System.out.println();
        }

    }
}
