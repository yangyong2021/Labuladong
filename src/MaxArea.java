public class MaxArea {
    public static void main(String[] args) {
        int nums[] = new int[]{1,1};
        int max = maxArea(nums);
    }

    private static int maxArea(int[] nums) {
        int l = 0, r = nums.length - 1,max=0;
        while (l<r){
            int tmp = Math.min(nums[r], nums[l]);
            max = Math.max(max, (tmp * (r - l)));
            if (nums[r] < nums[l]){
                r--;
            }else{
                l++;
            }
        }
        return max;
    }
}
