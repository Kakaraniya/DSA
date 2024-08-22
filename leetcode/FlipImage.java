//https://leetcode.com/problems/flipping-an-image/description/
package leetcode;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0 ;i < image.length; i++){
            int start = 0 ;
            int end = image[i].length-1;

            while(start<=end){
                int temp = image[i][start];
                image[i][start]= image[i][end];
                image[i][end]= temp;
                start ++;
                end --;
            }
        }
        for(int i= 0 ; i < image.length ; i++){
            for(int j = 0 ; j < image[0].length ; j++){
                image[i][j] = image[i][j] ^ 1;
            }
        }
        return image;
    }
}
