class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i =0;i<n;i++){
         char ch = s.charAt(i);
         if(ans.length()>0 &&ans.charAt(ans.length()-1) == ch){
            ans.deleteCharAt(ans.length()-1);
         }else{
            ans.append(ch);
         }
        }
        return ans.toString();
   }
}