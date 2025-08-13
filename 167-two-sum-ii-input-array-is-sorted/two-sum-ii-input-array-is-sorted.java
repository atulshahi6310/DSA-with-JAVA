class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length - 1;
        while(lp !=rp){
            if(numbers[lp] + numbers[rp] == target){
                return new int[]{lp+1,rp+1};
            }
            if(numbers[lp] + numbers[rp] > target){
                rp--;
            }else{
               lp++ ;
            }
        }
        return new int[]{};
    }
}