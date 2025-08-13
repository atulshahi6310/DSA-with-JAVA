class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int left = 0;
        int right = n-1;
        int place = n-1;
        while(left<= right){
            int leftsq = nums[left]*nums[left];
             int rightsq = nums[right]*nums[right];
             if(leftsq >rightsq){
                arr[place] = leftsq;
                left++;
             }
             else{
                arr[place] = rightsq;
                right--;
             }
         place--;
        }
        return arr;
    }
}