class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 1;
        int e = num/2;
        if(num ==1){
            return true;
        }
        while(s<= e){
            int mid = s +(e-s)/2;
            long sq = (long)mid *mid;
            if(sq == num){
                return true;
            }else if(sq >num){
                e = mid -1;
            }else{
                s = mid +1;
            }
        }
        return  false;
    }
}