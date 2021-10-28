package crio.programmingconstructs;

public class PatternSix {
    public static void main(String[] args) {
        patternSix(4);
    }
    static void patternSix(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColumnsInRow = row>n?2*n-row:row;
            int noOfSpaces = n - totalColumnsInRow;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
