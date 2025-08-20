class Solution {
    public String reverseWords(String s) {
        String[] arr =s.trim().split("\\s+");;
        int lp = 0;
        int rp = arr.length - 1;
        while(lp < rp){
             String temp = arr[lp];
             arr[lp] = arr[rp];
             arr[rp] = temp;
             rp--;
             lp++;
        }
        return String.join(" " ,arr);
    }
}