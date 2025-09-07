class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <=2){
           return n;
        }
        int lp =1;
        int count = 1;
        for(int rp =1; rp<n; rp++){
            if(nums[rp] == nums[rp-1]){
                count++;
            }else{
                count = 1;
            }
            
            if(count <= 2){
                nums[lp] = nums[rp];
                lp++;
            }
        }
        return  lp ;
    }
}

