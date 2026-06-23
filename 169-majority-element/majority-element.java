class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int candinate = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(count ==0){
                candinate = nums[i];
            }
            if(nums[i] == candinate){
                count +=1;
            }else{
                count-=1;
            }
        }
        return candinate;
    }
}