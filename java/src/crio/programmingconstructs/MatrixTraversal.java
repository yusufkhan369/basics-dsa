package crio.programmingconstructs;

import java.io.*;
import java.util.*;

class MatrixTraversal  {

    public List<Integer> matrixTraversal(int[][] matrix, int currPosRow, int currPosCol,  int dirToMove, int stepsToMove) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i< matrix.length;i++){
            for(int j = 0; j<matrix.length;i++){
                res.add(matrix[currPosCol][currPosCol]);
            }
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int currPosX = scanner.nextInt();
        int currPosY = scanner.nextInt();
        int dirToMove = scanner.nextInt();
        int stepsToMove = scanner.nextInt();

        scanner.close();
        List<Integer> result = new MatrixTraversal().matrixTraversal(matrix, currPosX, currPosY, dirToMove, stepsToMove);

        for (int i = 0; i < result.size(); ++i) {
            System.out.printf("%d ", result.get(i));
        }
    }
}