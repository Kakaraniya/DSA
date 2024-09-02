//https://leetcode.com/problems/sudoku-solver/
package leetcode;

public class SudokuSolver {
    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        solveSudoku(board);
        for(char[] row : board) {
            for(char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void solveSudoku(char[][] board) {
        boolean leftEmpty = false;
        int row = -1, col = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {  // Compare with char '.'
                    leftEmpty = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if (leftEmpty)
                break;
        }

        if (!leftEmpty)
            return;

        for (int num = 1; num <= 9; num++) {  // Sudoku numbers range from 1 to 9
            if (isSafe(board, row, col, num)) {
                board[row][col] = (char) (num + '0');  // Convert int to corresponding char
                solveSudoku(board);  // Recurse
                if (isSolved(board))  // If solved, return
                    return;
                else
                    board[row][col] = '.';  // Backtrack
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col, int num) {
        char numChar = (char) (num + '0');  // Convert int to corresponding char

        // Check if the number is not in the current row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == numChar)
                return false;
        }

        // Check if the number is not in the current column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == numChar)
                return false;
        }

        // Check if the number is not in the current 3x3 subgrid
        int n = (int) Math.sqrt(board.length);
        int boxRowStart = row - row % n;
        int boxColStart = col - col % n;
        for (int j = boxRowStart; j < boxRowStart + n; j++) {
            for (int k = boxColStart; k < boxColStart + n; k++) {
                if (board[j][k] == numChar)
                    return false;
            }
        }
        return true;
    }

    // Helper function to check if the board is completely solved
    private static boolean isSolved(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.')
                    return false;
            }
        }
        return true;
    }
}
