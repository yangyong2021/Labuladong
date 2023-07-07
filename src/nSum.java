import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class nSum {

    public static void main(String[] args) {
        int nums[] = new int[]{1,1,1,1,2,2,3,0,0,4,0};
        Arrays.sort(nums);
        List<List<Integer>> ans = nSum(nums, 0, 4, 4);
        System.out.println(ans);
    }

    public static List<List<Integer>> nSum(int nums[], int start, int target, int n) {
        List<List<Integer>> ans = new LinkedList<>();
        int sz = nums.length;
        if (n > sz || n < 2) return ans;
        if (n == 2) {
            int lo = start, hi = sz - 1;
            while (lo < hi) {
                int sum = nums[lo] + nums[hi];
                int left = nums[lo], right = nums[hi];
                if (target < sum) {
                    while (lo < hi && right == nums[hi]) hi--;
                } else if (target > sum) {
                    while (lo < hi && left == nums[lo]) lo++;
                } else {
                    ans.add(new ArrayList<>(Arrays.asList(left, right)));
                    while (lo < hi && left == nums[lo]) lo++;
                    while (lo < hi && right == nums[hi]) hi--;
                }
            }

        } else {
            for (int i = start; i < sz; i++) {
                List<List<Integer>> res = nSum(nums, i + 1, target - nums[i], n - 1);
                for (List<Integer> list : res) {
                    list.add(nums[i]);
                    ans.add(list);
                }
                while (i < sz - 1 && nums[i] == nums[i + 1]) i++;
            }
        }
        return ans;
    }
}
