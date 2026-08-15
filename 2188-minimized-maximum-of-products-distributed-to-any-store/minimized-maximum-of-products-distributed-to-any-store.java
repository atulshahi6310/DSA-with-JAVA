class Solution {
    static boolean is_distrubuted(int n, int[] quantities , int mid){
        int total_shops =0;
        for(int num :quantities){
            total_shops += (num+mid-1)/mid;
        }
        return total_shops <=n;

    }
    public int minimizedMaximum(int n, int[] quantities) {
        int max =0;
        for(int num:quantities){
            max = Math.max(num,max);
        }
        int s =1 ;
        int e = max;
        int ans =0;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(is_distrubuted(n,quantities,mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
}