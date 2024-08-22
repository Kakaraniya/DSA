//https://leetcode.com/problems/transpose-matrix/description/
package leetcode;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };
        int[][] mat1 = transpose(mat);
        for(int i = 0; i<mat[0].length; i++){
            for(int j = 0; j<mat.length; j++){
                System.out.print(mat1[i][j]);
            }
            System.out.println();
        }


    }
    static int[][] transpose(int[][] matrix) {
        int[][] mat = new int[matrix[0].length][matrix.length];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                mat[j][i] = matrix[i][j];
            }
        }
        return mat;
    }
}
