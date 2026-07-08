class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int nm = n + m;
        int[] arr = new int[nm];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = nums1[i];
            idx++;
        }
        for (int i = 0; i < m; i++) {
            arr[idx] = nums2[i];
            idx++;
        }
        Arrays.sort(arr);
        if (nm % 2 == 0) {
            int x = nm / 2;
            double median = (arr[x - 1] + arr[x]) / 2.0;
            return median;
        }
        int mid = nm / 2;
        return arr[mid];
    }
}