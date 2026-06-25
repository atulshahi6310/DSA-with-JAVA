class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList <Integer> l1 = new ArrayList<>();
        int n = nums1.length;
        int m =nums2.length;
        for(int i =0;i<n;i++){
            l1.add(nums1[i]);
        }
        for(int i =0;i<m;i++){
            l1.add(nums2[i]);
        }
        Collections.sort(l1);
        int x = l1.size();   
        
        int[] arr = new int[x];
        for(int i =0;i<x;i++){
            arr[i] = l1.get(i);
        }
        
        int mid = arr.length/2;
        double median =0;

        if(arr.length%2==0){
            
            median = (arr[mid] +arr[mid-1])/2.0;
        }else{
            median = arr[mid];
        }
        return median;
    }
}