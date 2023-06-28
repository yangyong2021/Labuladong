import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int t[] = new int[]{5, 9, 7, 4, 1, 3, 2, 8};
        bubbleSort(t);
    }

    public static void bubbleSort(int nums[]) {
        int n = nums.length - 1;
        // 控制冒泡次数
        while (true) {
            //控制比较次数
            // last记录最后一次比较的下标
            int last = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("比较次数：" + i);
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                    // 最后一次比较索引为下一次比较的总次数
                    last = i;
                }
            }
            // 下一次冒比较次数的总次数动态变化
            n = last;
            System.out.println(Arrays.toString(nums));
            // 当比较到数组头的时候就不在冒泡。
            if (n == 0) break;
        }

    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
