class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int positive_sign =0;
        int negative_sing =1;
        for(int i =0;i<n;i++){
            if(nums[i] >0){
                result[positive_sign] = nums[i];
                positive_sign +=2;
            }
            if(nums[i] <0){
                result[negative_sing] = nums[i];
                negative_sing +=2;
            }
        }
        return result;
    }
}