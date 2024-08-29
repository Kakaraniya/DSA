package Recursion;



public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0,0,4);
    }

    public static void knights(boolean[][] board, int row, int col, int k) {
        if(k == 0){
            display(board, row, col);
            System.out.println();
        }

        if(row ==board.length -1 && col == board.length )
            return;

        if(col == board.length){
            knights(board, row+1, 0, k);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            knights(board, row, col+1, k-1);
            board[row][col] = false;
        }
        knights(board, row, col+1, k);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board, int row, int col) {
        for(boolean[] r : board){
            for(boolean element : r){
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
    }

}
