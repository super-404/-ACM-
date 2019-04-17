package 程序竞赛题;

public class 在多个字符串数组中找到最长的公共前缀 {
    public static void main(String[] args) {
        String s[]={"a"};
        System.out.println(longestCommonPrefix(s));
    }
   //方法一
    /*public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix)!=0)//在这里利用了indexof如果有相同的字符串在最前面那么肯定可已返回下标为零
            {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }*/

//方法2
public static String longestCommonPrefix(String[] strs) {
    if (strs.length==0)
        return "";
    for(int i=0;i<strs[0].length();i++){
               int ch=strs[0].charAt(i);
        for(int j=1;j<strs.length;j++)
            if(i==strs[j].length()||strs[j].charAt(i)!=ch)
                return strs[0].substring(0,i);
    }

    return strs[0];
}


}
