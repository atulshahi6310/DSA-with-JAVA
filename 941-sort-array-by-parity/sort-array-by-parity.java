class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        // int arr1 [] ={};
        if(n<2) {
        return arr;
        }
        
        while(j<arr.length){
            if(arr[j]%2 ==0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return arr;
    }
}