package 程序竞赛题.leetcode;



import java.lang.reflect.Method;
import java.util.Arrays;

public class RotateImage {

    /**
     * @Author: 饶嘉伟
     * @Description: 将一个二维数组旋转九十度
     * @Date: 2019/9/10 9:25
     * @Param a
     * @retur: a
     **/

    public  static void rotate(int[][] matrix) {
        int n=matrix[0].length;
        int temp=0;

        for(int i=0;i<matrix.length/2;i++){

              for(int j=i;j<n-1-i;j++){
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[n-1-j][i];
                    matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                    matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                    matrix[j][n-1-i]=temp;
              }
          }
        for(int i=0;i<matrix.length;i++)
        System.out.println (Arrays.toString (matrix[i]));
    }

    public static void main(String[] args) {
         int a[][]={ {5, 1, 9,11},
                 { 2, 4, 8,10},
                 {13, 3, 6, 7},
                 {15,14,12,16}};
    rotate(a);

    }

}
