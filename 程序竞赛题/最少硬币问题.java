package 程序竞赛题;

import java.util.Scanner;

public class 最少硬币问题 {
     static int a[]={1,5,10,50,100};
    public static void main(String[] args) {
        System.out.println ("请输入总数");
         int sum=new Scanner (System.in).nextInt ();
        int count=0;
       for(int i=a.length-1;i>=0;i--) {
           while (sum >= a[i]) {
               sum = sum - a[i];
               count++;
           }
       }
       System.out.println (count);

    }
}
