//https://leetcode.com/problems/matrix-diagonal-sum/description/
package leetcode;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };

        System.out.println(diagonalSum(mat));
    }

    static public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i< n; i++){
            if((i)!=(n-1-i))
                sum = sum + mat[i][i] + mat[i][n-1-i];
            else
                sum += mat[i][i];
        }
        return sum;
    }
}

