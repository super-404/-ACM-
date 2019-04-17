package 程序竞赛题;

import java.util.ArrayList;
import java.util.List;



public class CombinationSum {


    public static void main(String[] args) {
        int a[] = {2, 3, 6, 7};
        List<List<Integer>> list = combinationSum (a,8);
        for(List l:list){
            System.out.println (l.toString ());
        }

    }



    private static List<List<Integer>> combinationSum(int[] a,int target) {
        /**
         * @Author: 饶嘉伟
         * @Description: 给定一组候选数字（candidates）（没有重复）和目标数字（target），
         * 找到candidates 候选数字相加的所有唯一组合target。
         *相同重复数目可以选自candidates 无限次数。
         * 注意：
         *所有数字（包括target）都是正整数。
         * 解决方案集不得包含重复的组合。
         *
         *
         *
         * @Date: 2019/4/16 20:06
         * @Param: [a, target]
         * @return: java.util.List<java.util.List   <   java.lang.Integer>>
         **/


        List<List<Integer>> list =new ArrayList<> ();


        backtricp(list, new ArrayList<> (),a,target,0);

                 return list;


    }

    private static void  backtricp(List<List<Integer>> list, List<Integer> listInteger, int[] a, int target, int start) {
          //当target==0时说明已经找到了解
        if(target==0){
            //将这组解添加进list
                  list.add(new ArrayList<> (listInteger));
                  //然后返回到调用的上一级
                  return ;
              }
             else
                 if(target<0){
                   //当target<0时当然不满足条件
                     // 返回上一级
                     return ;
               }

          else
              for(int i=start;i<a.length;i++){
                  //将数字加入到列表中
                  listInteger.add (a[i]);
                  //这个递归是程序的灵魂
                  //注意后两个参数
                  //target-a[i];
                  //试探a[i]这组解是否满足条件；
                  //这个i是我们保证我们不会取到相同解的关键
                  backtricp (list,listInteger,a,target-a[i],i);
                  //返回以后因为刚才那组解要么是正确的
                  //要么是错误的
                  //但是不论正确还是错误
                  //那组解已经被我们使用了
                  //所以我们删掉最后一个数字
                  //然后去试探其他的数字
                  listInteger.remove(listInteger.size ()-1);

              }
    }


}

