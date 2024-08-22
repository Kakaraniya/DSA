package Arrays;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {41, 42, 43, 44},
                {50, 60, 70, 80},
                {83, 84, 85, 86},
                {87, 90, 92, 93}
        };
        System.out.println(Arrays.toString(search(matrix, 60)));

    }
    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int rowS = 0;
        int rowE = rows -1;
        int colM = (cols-1)/ 2;
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(0, 0, cols-1,matrix, target);
        }
        while(rowS<rowE-1){
            int rowM = rowS + (rowE - rowS)/ 2;
            if(matrix[rowM][colM] == target)
                return new int[]{rowM, colM};
            else if(matrix[rowM][colM]< target)
                rowS = rowM;
            else
                rowE = rowM;
        }

        if(matrix[rowS][colM]== target)
            return new int[]{rowS,colM};

        if(matrix[rowS+1][colM] == target)
            return new int[]{rowS + 1, colM};

        if(target < matrix[rowS][colM])
            return binarySearch(rowS, 0, colM-1, matrix, target);
        if(target> matrix[rowS][colM] && target<= matrix[rowS][cols-1])
            return binarySearch(rowS, colM + 1, cols - 1, matrix, target);
        if(target< matrix[rowS + 1][colM] && target>= matrix[rowS+1][0])
            return binarySearch(rowS+1, 0 , colM-1, matrix, target);
        else
            return binarySearch(rowS+1, colM +1 , cols-1, matrix, target);
    }

    static int[] binarySearch(int row, int colS, int colE, int[][] arr, int target){
        while(colS<=colE){
            int mid = colS + (colE - colS) / 2;
            if(arr[row][mid] == target)
                return new int[]{row,mid};
            else if(arr[row][mid] > target)
                colE = mid - 1;

            else
                colS = mid + 1;
        }
        return new int[] {-1,-1};
    }
}
