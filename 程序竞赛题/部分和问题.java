package 程序竞赛题;

import java.util.Scanner;

public class 部分和问题 {
    static Scanner  in=new Scanner(System.in);
   static  int a[]=new int [20];
   static int n;
    static int k;


    public static void main(String[] args) {
        n=in.nextInt();

        for ( int i = 0; i <n ; i++) {
            a[i]=in.nextInt();
        }
        k=in.nextInt();
        int i=0;
        int sum=0;
        if(dfs(i,sum))
            System.out.println("Yes");
        else
            System.out.println("NO");

    }
static boolean dfs(int i,int sum){
/** * @Author: 饶嘉伟
* @Description: 这是一个部分和问题
*
* 给你n个数(a1,a2,a3.......an) ,是否存在某一些数字加起来等于k,有就输出 "YES",否则输出 "NO"。
*
* 数据范围：n<20;
* a1+a2+....an在int范围里面.
*
*
* @Date: 2019/3/25 19:54
* @Param: [i, sum]
* @return: boolean
**/

    if(i==n)
        return sum==k;
//对于每一个数我们都有了两个选择
    // 我们可选择加上或是不加上
    //当他不加的时候
         if(sum>k)
        return false;
    if(dfs(i+1,sum))

       return true;
// 当他加上的时候
   if(dfs(i+1,sum+a[i]))
    return true;

    return false;

}


}
