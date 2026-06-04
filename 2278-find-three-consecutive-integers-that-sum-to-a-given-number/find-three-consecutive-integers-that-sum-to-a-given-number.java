class Solution {
    public long[] sumOfThree(long num) {
        

        if(num%3>0)  return new long[0];;

        long y = num/3;
            
        
        return new long[]{y - 1, y, y + 1};
        
    }
}