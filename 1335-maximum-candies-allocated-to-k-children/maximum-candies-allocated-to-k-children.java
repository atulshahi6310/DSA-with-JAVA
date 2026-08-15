class Solution {
    static boolean solve(int[] candies ,long k , int mid){
        long total_student_get =0;
        for(int candie :candies){
            total_student_get += candie/mid;
            if(total_student_get >=k) return true;
        }
        return total_student_get >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        int s =1;
        int max =0;
        
        for(int n:candies){
            max = Math.max(max,n);
        }
        int e = max;
        int ans =0;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(solve(candies,k,mid)){
                ans = mid;
                s =mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
}