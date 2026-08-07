class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[n+m];
        int i =0;
        int j =0;
        int k =0;
        while(i <m && j<n){
            if(nums1[i] >nums2[j]){
                arr[k] = nums2[j];
                j++;
                k++;
            }else{
                arr[k] = nums1[i];
                i++;
                k++;
            }
        } // this brak when the all elemnetss of one is copyed 

        if(i >= m){
            while(j <n){
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(j >= n){
            while(i <m){
                arr[k] = nums1[i];
                i++;
                k++;
            }
        }

        for(int w=0;w<arr.length;w++){
            nums1[w] = arr[w];
        }
    }
}