class Solution {
    static boolean isposs(int[] price,int k,int mid){
        int candies =1;
        int prev = price[0];
        for(int i =1;i<price.length;i++){
            if(price[i]-prev >=mid){
                candies++;
                prev = price[i];
            }
        }
        return candies >=k;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int s =0;
        int e = price[price.length-1]  - price[0];
        int ans =0;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(isposs(price,k,mid)){
                ans =mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
}