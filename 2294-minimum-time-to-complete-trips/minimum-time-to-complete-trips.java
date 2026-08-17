class Solution {
    static boolean iscompleted(int[] time ,int total ,long mid){
        long trip =0;
        for(int i=0;i<time.length;i++){
            if(time[i] <= mid){
               trip += mid / time[i];
            }
        }
        return trip >= total;
    }
    public long minimumTime(int[] time, int totalTrips) {
        int min =Integer.MAX_VALUE;
        int max = 0;
        for(int t:time){
            min = Math.min(min,t);
            max = Math.max(max,t);
        }
        long s = min;
        long e = (long)min*totalTrips;
        long ans =0;
        while(s<=e){
            long mid = (long)s +(e-s)/2;
            if(iscompleted(time,totalTrips,mid)){
                ans = mid;
                e= mid-1;
            }else{
                s = mid+1;
            }
        }
        return  ans;
    }
}