public class NumSquares {
    public static void main(String[] args) {
        int ans = numSquares(1);
        System.out.println(ans);
    }

    public static int numSquares(int n) {
        // 判断只有一个数
        if (is1(n)) return 1;
        // 判断由两个平方数相加
        for (int i = 1; i < n; i++) {
            int j = n - i * i;
            if (is1(j)) return 2;
        }
        // 判断四个平方数相加
        if (is4(n)) return 4;
        return 3;
    }

    public static boolean is1(int n) {
        int tmp = (int) Math.sqrt(n);
        return tmp * tmp == n;
    }

    public static boolean is4(int n) {
        while (n % 4 == 0) {
            n = n / 4;
        }
        return (n % 8) == 7;
    }
}
