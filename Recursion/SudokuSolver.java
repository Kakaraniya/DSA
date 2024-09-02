package Recursion;

public class SudokuSolver {
    public static void main(String[] args) {
        String[][] board =
                {
                        {"5", "3", ".",  ".", "7", ".",  ".", ".", "."},
                        {"6", ".",  ".",  "1", "9", "5", ".", ".", "."},
                        {".",  "9", "8", ".", ".",  ".",  ".", "6", "."},
                        {"8", ".",  ".",  ".", "6", ".",  ".", ".", "3"},
                        {"4", ".",  ".",  "8", ".",  "3", ".", ".", "1"},
                        {"7", ".",  ".",  ".", "2", ".",  ".", ".", "6"},
                        {".",  "6", ".",  ".", ".",  ".",  "2", "8", "."},
                        {".",  ".",  ".",  "4", "1", "9", ".", ".", "5"},
                        {".",  ".",  ".",  ".", "8", ".",  ".", "7", "9"}
                };



        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    private static void display(String[][] board) {
        for(String[] row : board) {
            for(String num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static boolean solve(String[][] board) {
        boolean leftEmpty = false;
        int row = -1, col = -1;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                if(board[i][j].equals(".")){
                    leftEmpty = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if(leftEmpty)
                break;
        }

        if(!leftEmpty)
            return true;

        for(int num = 1; num<=board.length; num++){
            if(isSafe(board, row, col, num )){
                board[row][col] = String.valueOf(num);
                if(solve(board))
                    return true;
                else
                    board[row][col] = ".";
            }
        }
        return false;
    }

    private static boolean isSafe(String[][] board, int row, int col, int num) {
        for(int i = 0; i<board.length; i++){
            if(board[row][i] == String.valueOf(num))
                return false;
        }
        for(String[] nums: board){
            if(nums[col].equals(String.valueOf(num)))
                return false;
        }
        int n = (int) Math.sqrt(board.length);
        int boxRowStart= row - row % n;
        int boxColStart = col - col % n;
        for(int j = boxRowStart; j< boxRowStart + n; j++ ){
            for (int k = boxColStart; k < boxColStart + n ; k++) {
                if(board[j][k].equals(String.valueOf(num)))
                    return false;
            }
        }
        return true;
    }

}
