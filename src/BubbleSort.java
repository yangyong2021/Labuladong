public class BubbleSort {
    public static void main(String[] args) {

        int t[] = new int[]{3, 5, 2, 1, 12};
        bubbleSort(t);
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }

    public static void bubbleSort(int nums[]) {

        for (int i = 1; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
