package 程序竞赛题;

public class 移除数组中的相同项 {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,2,3,4,4,5};
removeDuplicates (nums);
    }

    public static int removeDuplicates(int[] nums) {
        /**
         * @Author: 饶嘉伟
         * @Description: 数组完成排序后，
         * 我们可以放置两个指针 i和 j，其中 i 是慢指针，
         * 而 j 是快指针。只要 nums[i] = nums[j]，我们就增加 jj 以跳过重复项。
         *
         * 当我们遇到 nums[i]nums[j]!=nums[i] 时，
         * 跳过重复项的运行已经结束，
         * 因此我们必须把它（nums[j]nums[j]）的值复制到 nums[i + 1]
         * 然后递增 i，接着我们将再次重复相同的过程，
         * 直到 j 到达数组的末尾为止。
         * @Date: 2019/4/15 19:40
         * @Param: [nums]
         * @return: int
         **/

        if (nums.length == 0) return 0;
    int i = 0;

    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {

            i++;
            //这个是为了替换掉数组中的重复项
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
}
