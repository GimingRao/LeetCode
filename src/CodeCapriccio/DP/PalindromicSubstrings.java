package CodeCapriccio.DP;

/**
 * 给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。
 *
 * 回文字符串 是正着读和倒过来读一样的字符串。
 *
 * 子字符串 是字符串中的由连续字符组成的一个序列。
 *
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 *
 * @author GimingRao
 * @data 2023/4/6 19:59
 */
public class PalindromicSubstrings {
    /**
     * @param s 母串
     * @return int
     *
     * dp[i][j] 表示以i开头，长度为j+1的子串
     * 初始化： dp[i][0] = true; dp[i][1] = s.charAt(i)==s.charAt(i+1)
     * 状态转移： dp[i][j] = dp[i+1] [j-2]
     * 循环方式
     *   for j in range(2 , length)
     *      for i in range (0 , length)
     */
    public int countSubstrings(String s) {
        int length = s.length();
        boolean [][] dp = new boolean [length][length];
        int ans = 0 ;
        for (int i = 0; i < length ; i++) {
            dp[i][0] = true;
            ans ++;
            if (i != length-1) {
                dp[i][1] = s.charAt(i) == s.charAt(i + 1);
                if (dp[i][1])
                    ans++;
            }
        }
        for (int j = 2; j < length; j++) {
            for (int i = 0; i < length; i++) {
                if (i + j >= length)
                    break;
                dp[i][j] = dp[i+1] [j-2] && s.charAt(i) == s.charAt(i + j);
                if (dp[i][j])
                    ans++;
            }
        }
        return ans;
    }
}
