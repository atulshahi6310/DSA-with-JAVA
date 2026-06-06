class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int n = arr.length;
        int count =0;
        int boat =0;
        int left =0;
        int right =n-1;;
        while(left <=right){
            if(arr[left] + arr[right] <=limit){
                left++;
                right--;
            }else{
                right--;
            }
            boat++;
        }
        return boat;
    }
}