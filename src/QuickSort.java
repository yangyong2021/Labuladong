

public class QuickSort {
    public static void main(String[] args) {
        int test[] = new int[]{9, 3, 1, 5, 12, 5};
        quickSort(test, 0, test.length - 1);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    public static void quickSort(int nums[], int low, int high) {

        if (low >= high) {
            return;
        }
        int q = partition(nums, low, high);
        quickSort(nums, low, q - 1);
        quickSort(nums, q + 1, high);

    }

    private static int partition(int[] nums, int low, int high) {
        int p = nums[high];
        int i = low, j = low;
        while (j < high) {
            if (nums[j] < p) {
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
