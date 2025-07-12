import java.util.Random;

class Solution {
    private static final Random rand = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        while (low < high) {
            // Use insertion sort for small arrays
            if (high - low < 10) {
                insertionSort(nums, low, high);
                return;
            }

            // Random pivot to avoid worst-case scenarios
            int pivotIndex = low + rand.nextInt(high - low + 1);
            swap(nums, pivotIndex, high);

            int pidx = partition(nums, low, high);

            // Tail call optimization: recurse on smaller part first
            if (pidx - low < high - pidx) {
                quickSort(nums, low, pidx - 1);
                low = pidx + 1;
            } else {
                quickSort(nums, pidx + 1, high);
                high = pidx - 1;
            }
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                if (i != j) swap(nums, i, j);
            }
        }

        if (i + 1 != high) swap(nums, i + 1, high);
        return i + 1;
    }

    private void insertionSort(int[] nums, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= low && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) return;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
