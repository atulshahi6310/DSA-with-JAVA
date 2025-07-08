class Solution {
    public int majorityElement(int[] nums) {
      int count = 0;
      int repeat =0 ;
      for(int i =0 ; i<nums.length; i++){
        if(count == 0){
            repeat = nums[i];   
        }
        if(nums[i] == repeat){
            count++;
        }else{
            count--;
        }
      }
        return  repeat;
    }
}