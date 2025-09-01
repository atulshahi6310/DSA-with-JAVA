class Solution {
    public void rotate(int[] arr, int k) {
      int[] store = new int[arr.length];
      k = k% arr.length;
      for(int i =0 ; i<arr.length;i++){
        store[(i+k)%arr.length] = arr[i];

      }

      for(int i=0 ;i<arr.length;i++){
        arr[i] = store[i];
      }
    }
}