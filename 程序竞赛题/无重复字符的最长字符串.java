package 程序竞赛题;

public class 无重复字符的最长字符串 {
    public static void main(String[] args) {


    }

    public int lengthOfLongestSubstring(String s) {
        int next[] = new int[256];
        int i = 0;
        int max = 0;
        for (int j = 0; j < s.length(); j++) {

            i = Math.max(next[s.charAt(j)], i);//但字符再次出现的时候，得到刚刚记下的那个位置

            max = Math.max(max, j - i + 1);//j代表着现在字符出现的位置，用j-i+1就可以得到一个没有相同字符的字符串长度

            next[s.charAt(j)] = j + 1;//记下第一次字符出现的位置


        }
        return max;
    }
}