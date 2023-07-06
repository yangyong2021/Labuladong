import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        int n = 9, k = 3;
        combinationSum3(k, n);
        System.out.println(ans.toString());
    }

    static List<List<Integer>> ans = new LinkedList<>();
    // 记录回溯路径
    static LinkedList<Integer> track = new LinkedList<>();

    public static List<List<Integer>> combinationSum3(int k, int n) {
        back(1, n, k, 0);
        return ans;
    }

    static int c = 0;

    public static void back(int start, int n, int k, int sum) {

        if (sum == n && c == k) {
            ans.add(new LinkedList<>(track));
            return;
        }
        if (sum > n) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            track.add(i);
            sum += i;
            c++;
            back(i + 1, n, k, sum);
            sum -= i;
            c--;
            track.removeLast();
        }
    }
}
