import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Subsets {
    static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(Arrays.toString(ans.stream().toArray()));

    }

    public static List<List<Integer>> subsets(int[] nums) {
        //定义路径数组
        LinkedList<Integer> track = new LinkedList<>();
        back(nums, 0, track);
        return ans;
    }

    public static void back(int nums[], int index, List<Integer> track) {
        ans.add(new LinkedList<>(track));
        //for循环遍历数组nums
        for (int i = index; i < nums.length; i++) {
            //做选择，将选择添加到路径数组中
            track.add(nums[i]);
            // 回溯
            back(nums, i + 1, track);
            //撤销选择，将选择从路径中删除
            track.remove(track.size() - 1);
        }
    }
}
