
/**
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 *
 * An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:
 *
 * s = s1 + s2 + ... + sn
 * t = t1 + t2 + ... + tm
 * |n - m| <= 1
 * The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
 * Note: a + b is the concatenation of strings a and b.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * Output: true
 * Example 2:
 *
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * Output: false
 * Example 3:
 *
 * Input: s1 = "", s2 = "", s3 = ""
 * Output: true*/



public class InterLeavingString {
    public static boolean IsInterLeave(String s1, String s2, String s3){
        if (s1.length() + s2.length() != s3.length())
            return false;
        int m = s1.length(), n = s2.length();

        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i = 1; i <= n; ++i) {
            dp[i] = dp[i-1] && s3.charAt(i-1) == s2.charAt(i-1);
        }

        for (int i = 1; i <= m; ++i) {
            for (int j = 0; j <= n; ++j) {
                if (j == 0)
                    dp[j] = dp[j] && s3.charAt(i-1) == s1.charAt(i-1);
                else
                    dp[j] = (dp[j] && s3.charAt(i+j-1) == s1.charAt(i-1)) || (dp[j-1] && s3.charAt(i+j-1) == s2.charAt(j-1));
            }
        }

        return dp[n];
    }

    public static void main(String[] args){

    }
}
