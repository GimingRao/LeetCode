package CodeCapriccio.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
 * 注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用
 *
 * @author GimingRao
 * @data 2023/4/4 9:21
 */
public class WordBreak {
    /**
     * 单词分割
     *
     * @param s        被拆分的字符串
     * @param wordDict 词dict
     * @return boolean
     *
     * 完全背包问题
     * 循环wordDict.size()次
     * dp[i]为s的0-i子串能否分割
     * dp长度为s.length+!
     *
     * 初始化：  遍历wordDict.get(0)
     */
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        int legthOfFirstWord = wordDict.get(0).length();
        dp[0] =true;
         for (int j = 0; j < dp.length ; j++){
             for (int i = 0; i < wordDict.size(); i++){
                 if (j < wordDict.get(i).length())
                     continue;
                int lengthOfCurWord = wordDict.get(i).length();
                String substring = s.substring(j - lengthOfCurWord, j);
                dp[j] = (dp[j - lengthOfCurWord] && substring.equals(wordDict.get(i))) || dp[j];
            }
        }
        return  dp[dp.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(wordBreak("applepenapple", Arrays.asList("apple","pen")));
    }
}
