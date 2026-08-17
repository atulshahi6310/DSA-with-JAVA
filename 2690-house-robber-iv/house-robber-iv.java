class Solution {
    static boolean capability(int[] nums ,int k ,int mincapability){
        // here we cheak the is the roober is able to rob more o r less then this mid monery 
        int i =0;
        int count =0;
        while(i<nums.length){
            if(nums[i] <= mincapability){
                i +=2;
                count++;
            }else{
                i++;
            }
        }
        return count >=k;
    }
    public int minCapability(int[] nums, int k) {
        // Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        int s = min;
        int e = max;
        int ans =0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (capability(nums, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}