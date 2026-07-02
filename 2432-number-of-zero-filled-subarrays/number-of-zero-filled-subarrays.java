class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count =0;
        long streek =0;
        for(int num :nums){
            if(num ==0){
                streek++;
            }else{
                streek =0;
            }
            count += streek;
        }
        return count;
    }
}























































































































