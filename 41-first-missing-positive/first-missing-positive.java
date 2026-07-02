class Solution {
    public int firstMissingPositive(int[] nums) {
        int miss =1;
        Arrays.sort(nums); /// o(nlogn)+o(n) -> o(nlog(n))
        for(int num :nums){
            if(num <=0){
                continue;
            }else if(num == miss){
                miss++;
            }else if(num >miss){
                break;
            }
        }
        return miss;
    }
}