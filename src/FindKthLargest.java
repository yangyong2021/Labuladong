import java.util.PriorityQueue;

/**
 * 寻找数组中第K大的值
 */
public class FindKthLargest {
    public static void main(String[] args) {

        int nums[] = new int[]{3,2,1,5,6,4};
        int k = 2;
        // 使用堆进行选择
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int num : nums) {
            q.offer(num);
            if (q.size() > k){
                q.poll();
            }
        }
        System.out.println(q.peek());

        // 使用快排选择
        quickSort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(nums[nums.length - k]);

    }

    /**
     * 使用快排进行查找
     */
    public static void quickSort(int nums[], int low, int high) {
        if (low >= high) {
            return;
        }
        int p = position(nums, low, high);

        quickSort(nums, low, p - 1);
        quickSort(nums, p + 1, high);
    }

    private static int position(int[] nums, int low, int high) {
        int p = nums[high];
        // 快慢指针
        int i = low, j = low;
        while (j < high) {
            if (p > nums[j]) {
                swap(nums, i, j);
                i++;
            }
            j++;

        }
        swap(nums, i, high);
        return i;

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
