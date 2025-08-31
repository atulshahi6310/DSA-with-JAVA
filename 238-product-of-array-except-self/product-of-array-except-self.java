class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Step 1: Prefix product
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }

        // Step 2: Suffix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        return result;
    }
}
