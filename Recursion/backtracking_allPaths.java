package Recursion;
import java.util.Arrays;
public class backtracking_allPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("", board, 0,0);
        allPathPrint("", board, 0, 0, 1, new int[board.length][board[0].length]);
    }
    static void allPath(String p, boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(!maze[r][c])
            return;
        maze[r][c] = false;
        if(r < maze.length-1) {
            allPath(p + "D", maze, r + 1, c);
        }
        if (c < maze.length-1) {
            allPath(p + "R", maze, r, c + 1);
        }
        if(c>0){
            allPath(p + "L", maze, r, c-1);
        }
        if(r>0){
            allPath(p+"U", maze, r-1, c);
        }

        maze[r][c] = true;
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int step, int[][] path) {
        if(r==maze.length-1 && c==maze[0].length-1){
            for(int[] num: path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }
        if(!maze[r][c])
            return;
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1) {
            allPathPrint(p + "D", maze, r + 1, c, step+1, path);
        }
        if (c < maze.length-1) {
            allPathPrint(p + "R", maze, r, c + 1, step+1, path);
        }
        if(c>0){
            allPathPrint(p + "L", maze, r, c-1, step+1, path);
        }
        if(r>0){
            allPathPrint(p+"U", maze, r-1, c, step+1, path);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
