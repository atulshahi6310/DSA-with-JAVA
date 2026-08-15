class Solution {
    static boolean canachive(int[] nums, int maxOperations,int mid){
        int operation =0;
        for(int num :nums){
            operation += (num-1)/mid;
            if(operation>maxOperations) return false;
        }
        return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int s= 1;
        int end =0;
        for(int num :nums){
            end = Math.max(num ,end);
        }
        while(s < end){
            int mid = s +(end -s)/2;
            if(canachive(nums,maxOperations,mid)){
                end = mid;
            }else{
                s = mid+1;
            }
        }
        return s;
    }
}