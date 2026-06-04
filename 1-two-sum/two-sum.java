class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        int lp = 0;
        int rp = 1;

        while (lp < nums.length - 1) {

            if (nums[lp] + nums[rp] == target) {
                arr[0] = lp;
                arr[1] = rp;
                return arr;
            }

            rp++;

            if (rp == nums.length) {
                lp++;
                rp = lp + 1;
            }
        }

        return arr;
    }
}