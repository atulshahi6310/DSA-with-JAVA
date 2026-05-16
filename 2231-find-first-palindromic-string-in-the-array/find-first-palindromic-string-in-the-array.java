class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            int lp =0;
            int rp = words[i].length() -1;
            while(lp<rp){
             if(words[i].charAt(lp) != words[i].charAt(rp)){
                break;
             }
             lp++;
             rp--;
            }
        
         
        if(lp >= rp){
         return words[i];
        }
        }
        return "";
    }
}