class Solution {
    public int[] sortedSquares(int[] nums) {
        int sol_arr[] = new int[nums.length];
        for(int i=0;i <nums.length;i++){
            sol_arr[i] = nums[i]*nums[i];
            
        }
        
            Arrays.sort(sol_arr);
        return sol_arr;
    }
}