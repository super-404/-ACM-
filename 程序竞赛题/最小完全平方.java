package 程序竞赛题;

import java.util.ArrayList;
import java.util.Scanner;

public class 最小完全平方 {
    public static void main(String[] args) {
        ArrayList<Integer> TheMinimumFactorOf = new ArrayList<>();
        int flag;
        System.out.println("请输入一个数字：");


        int M = new Scanner(System.in).nextInt();

        int count;
        int myGoal = 1;

        int j = 0;
        int number = 0;
        int temp = M;
        for (int i = 2; i<temp; i++) {
            while (M != 1) {
                if (M % i == 0) {
                    TheMinimumFactorOf.add(i);
                    j++;
                    M = M / i;
                    number++;
                } else
                    break;
            }

        }
        int first;
        int last;
        for(int i=2;i<20;i++)
        {
            if(TheMinimumFactorOf.contains(i))
            {
                first=TheMinimumFactorOf.indexOf(i);
                last=TheMinimumFactorOf.lastIndexOf(i);
                if((last-first+1)%2!=0)
                    myGoal*=i;
            }
        }





        System.out.println("能得到最小完全平方数是：" + myGoal);
        System.out.println("最小完全平方数是：" + myGoal * temp);
    }
}
