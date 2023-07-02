public class CountSubstrings {
    public static void main(String[] args) {
        String s = "aaa";
        int ans = countSubstrings(s);
        System.out.println(ans);
    }

    public static int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;

        boolean dp[][] = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                        ans++;
                    } else if (dp[i + 1][j - 1] == true) {
                        dp[i][j] = true;
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
