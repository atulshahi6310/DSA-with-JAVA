class Solution {
    static int pivote(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[n - 1]) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        int s = 0;
        int e = n - 1;
        int pivote = pivote(nums);

        if (pivote == n) {
            pivote = n - 1;
        }

        if (target > nums[n - 1]) {
            // search in the left part 
            while (s <= pivote) {
                int mid = s + (pivote - s) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    pivote = mid - 1;
                } else {
                    s = mid + 1;
                }

            }
            return -1;
        } else {
            int s1 = pivote + 1;
            // serch in the right part
            while (s1 <= e) {
                int mid = s1 + (e - s1) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    e = mid - 1;
                } else {
                    s1 = mid + 1;
                }

            }
            return -1;
        }

    }
}