package crio.programmingconstructs;

public class PatternFive {
    public static void main(String[] args) {
        patternFive(4);
    }
    static void patternFive(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColumnsInRow = row>n?2*n-row:row;
            for (int col = 0; col < totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
