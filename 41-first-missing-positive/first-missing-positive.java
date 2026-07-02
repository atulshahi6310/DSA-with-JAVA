class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n];
        for(int num : nums){
            if(num >0 && num <= n){
                seen[num-1] = true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!seen[i-1]){
                return i;
            }
        }
        return n+1;
    }
}


// int miss =1;
//         Arrays.sort(nums); /// o(nlogn)+o(n) -> o(nlog(n))
//         for(int num :nums){
//             if(num <=0){
//                 continue;
//             }else if(num == miss){
//                 miss++;
//             }else if(num >miss){
//                 break;
//             }
//         }
//         return miss;