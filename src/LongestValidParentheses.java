import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = ")()()()((()()()()";
        int ans = longestValidParentheses(s);
        System.out.println(ans);
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();// 记录字符串位置
        int dp[] = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
                dp[i + 1] = 0;
            } else {
                if (!stack.isEmpty()) {
                    int leftIndex = stack.pop();
                    int len = i + 1 - leftIndex + dp[leftIndex];
                    dp[i + 1] = len;
                } else {
                    dp[i + 1] = 0;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }

}
