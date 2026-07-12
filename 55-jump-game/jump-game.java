class Solution {
    public boolean canJump(int[] nums) {
      int crr_pos =0;
      for(int i=0;i<nums.length;i++){
        if(crr_pos <i) return false;
        crr_pos = Math.max(crr_pos,i+nums[i]);
      }
      return true;
        
    }
}
/* 
class Solution {
    static boolean solve(int[]nums , int index){
        if(index == nums.length-1){
            return true; // this is the case when we reach the destination 
        }
        if(index > nums.length-1){
            return false; // this is the case when we jump out of the range 
        }
        if(nums[index] ==0){
            return false; // this is the case when we reach the index where the  jump values is  0 means we can not jump anymore so we can not reach the end of the nums so return false;
        }

        // this is the type of recursen know as try all the combination 
        int jump = nums[index];
        boolean ans = false;
        for(int jumpp = 1;jumpp <= jump;jumpp++){
            boolean recans = solve(nums,index+jumpp);
            ans = ans||recans;
        }
        return ans;
    }
    public boolean canJump(int[] nums) {
        // this is the question of dynamic programing and this is the approch i am useing is the recuresion so this code may give me the time limit  pass error  but i solve this for the understanding of recursen 
        int index =0;
        boolean ans = solve(nums,index);
        return ans;
        
    }
}*/