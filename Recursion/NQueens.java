package Recursion;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueens(board, 0));
    }

    public static int nQueens(boolean[][] board, int row) {
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col = 0; col < board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += nQueens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        for(int i = 0; i< row; i++){
            if(board[i][col])
                return false;
        }

        int maxLeftDiagonal = Math.min(row,col);
        for(int j = 1; j<=maxLeftDiagonal; j++){
            if(board[row-j][col-j])
                return false;
        }
        int maxRightDiagonal = Math.min(row, board.length - col -1);
        for(int k = 1; k<=maxRightDiagonal; k++){
            if(board[row-k][col+k])
                return false;
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
    }


}
