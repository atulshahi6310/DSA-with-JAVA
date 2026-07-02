class Solution {
    public int firstMissingPositive(int[] nums) {
        int miss =1;
        Arrays.sort(nums);
        for(int num :nums){
            if(num <=0){
                continue;
            }else if(num == miss){
                miss++;
            }
        }
        return miss;
    }
}