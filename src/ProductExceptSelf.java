public class ProductExceptSelf {
    public static void main(String[] args) {
        int []nums = new int[]{1,2,3,4};
        int [] ans = productExceptSelf(nums);
    }
    public static int [] productExceptSelf(int []nums){
        int len = nums.length;
        int r[] = new int[len];
        int l[] = new int[len];
        int ans[] = new int[len];
        int left = 1,right = 1;
        for (int i = 0; i < len; i++) {
            r[i] = left * nums[i];
            left = r[i];
        }
        for (int i = len-1; i >=0 ; i--) {
            l[i] = right * nums[i];
            right = l[i];
        }
        ans[ans.length-1] = r[r.length-2];
        ans[0] = l[1];
        for (int i = 1; i < ans.length-1; i++) {
            ans[i] = r[i-1] * l[i+1];
        }
        return ans;
    }
}
