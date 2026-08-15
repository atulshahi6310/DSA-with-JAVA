class Solution {
    static boolean solve(int[] candies ,long k , long mid){
        long total_student_get =0;
        for(int candie :candies){
            total_student_get += candie/mid;
        }
        return total_student_get >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        long s =1;
        long max =0;
        
        for(int n:candies){
            max = Math.max(max,n);
        }
        long e = max;
        long ans =0;
        while(s<=e){
            long mid = s +(e-s)/2;
            if(solve(candies,k,mid)){
                ans = mid;
                s =mid+1;
            }else{
                e = mid-1;
            }
        }
        return (int)ans;
    }
}