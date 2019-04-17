package 程序竞赛题;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**有n个数字，每次选一个数， 每个数可用无限次，选4次，问加起来能否等于m.能输出Yes，否则输出No.
*1<=n<=1000
*   n=3
*   m=10
    k={1,3,5};
 *  输出：yes（1，1，3，5）
 *
 */
//暴力解法
public class 抽签 {
    public static void main(String[] args) {

        betterAnswer();
        Scanner in=new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        int k[]=new int [50];
        for (int i = 0; i <n ; i++) {
            k[i]=in.nextInt();
        }
        for (int a = 0; a <n ; a++) {
            for (int b = 0; b <n ; b++) {
                for (int c = 0; c <n ; c++) {
                    for (int d = 0; d <n ; d++) {
                        if(k[a]+k[b]+k[c]+k[d]==m) {
                            System.out.println("Yes");
                            return;
                        }
                        }
                }
            }

        }
        System.out.println("NO");
    }

   //优化后的答案
    public static void betterAnswer(){
        Scanner in=new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        int k[]=new int [50];
        for (int i = 0; i <n ; i++) {
            k[i]=in.nextInt();
        }
        Arrays.sort(k);
        for (int a = 0; a <n ; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
              if(Arrays.binarySearch(k,m-k[a]-k[b]-k[c])<0) {
                  System.out.println("Yes");
                 return ;
              }
                }

            }

        }
        System.out.println("NO");
    }




}
