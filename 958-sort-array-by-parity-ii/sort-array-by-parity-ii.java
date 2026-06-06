class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
      
        
        int[] even = new int[n / 2];
        int[] odd = new int[n / 2];

        int e = 0, o = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                even[e++] = num;
            } else {
                odd[o++] = num;
            }
        }
        e = 0;
        o = 0;
        for(int i =0;i<n ;i++){
            if(i%2 ==0){
                ans[i] = even[e++];
            }else{
               ans[i] = odd[o++];
            }
        }

        return ans;

    }
}