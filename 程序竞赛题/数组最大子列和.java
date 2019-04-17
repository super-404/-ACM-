package 程序竞赛题;

public class 数组最大子列和 {
    public static void main(String[] args) {
        int test[]={-2,11,-4,13,-5,-2};
        MaxChildSum(test);
        System.out.println( maxSubsequenceSum(test,0,5));
    }
    static void  MaxChildSum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){

            int tempsum = 0;
            for(int j=i;j<a.length;j++) {
                tempsum += a[j];
                if (tempsum > sum)
                    sum = tempsum;
            }
        }



        System.out.println(sum);




    }

    public static int maxSubsequenceSum(int[] a, int left, int right) {
        if(left == right) { //Base case
            if(a[left] > 0) {
                return a[left];
            } else {
                return 0; //保证最小值为0
            }
        }

        int center = (left+right)/2;
        int maxLeftSum = maxSubsequenceSum(a, left, center); //递归调用，求左部分的最大和
        int maxRightSum = maxSubsequenceSum(a, center+1, right);//递归调用，求右部分的最大和
        int leftBorderSum = 0, maxLeftBorderSum = 0;//定义左边界子序列的和
        for(int i=center; i>=left; i--) {//求左边界的最大和（从右边开始往左求和）
            leftBorderSum += a[i];
            if(leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }

        int rightBorderSum = 0, maxRightBorderSum = 0;//定义右边界子序列的和
        for(int i=center+1; i<=right; i++) {//求右边界的最大和（从左边开始往右求和）
            rightBorderSum += a[i];
            if(rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }

        //选出这三者中的最大值并返回（max3(int a, int 无内容2, int c)的实现没有给出）
        return  max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
    }
public static int  max3(int a,int b,int c){
        if(a>b&&a>c)
            return a;
        else
            if(b>a&&b>c)
                return b;
            else
                return c;


}
}
