class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int  candinate = 0;
        for(int i =0; i<nums.length; i++){
            if(count == 0){
                candinate = nums[i];
            }
            if(nums[i] == candinate){
                count++;
            }else{
                count--;
            }
        }
        return candinate;
    }
}