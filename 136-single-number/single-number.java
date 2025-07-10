class Solution {
    public int singleNumber(int[] nums) {
        int singleOne = 0;
        for(int i=0 ; i <nums.length;i++){
            singleOne ^= nums[i];
        }
        return singleOne;
    }
}