class Solution {
    static boolean isvalidposition(int[] arr, int m, int min_dist){
        int cowcount =1;
        int lastpos =0;
        for(int i =1;i<arr.length;i++){
            if(arr[i] - arr[lastpos] >=min_dist){
                cowcount++;
                lastpos = i;
                if(cowcount == m) return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
          Arrays.sort(position);
        int n = position.length;
        if(position[n-1] <m) return -1;
        int s =0;
        int e = position[n-1] -position[0];
        int ans =-1;
        
        while(s<=e){
            int mid = s +(e-s)/2;
            if(isvalidposition(position,m,mid)){
                ans = mid;
                s = mid +1;
            }else{
                e = mid -1;
            }
        }
        return ans;
    }
}