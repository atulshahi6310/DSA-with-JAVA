class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int n1 = t.length();
        if(n!=n1) return false;;

        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int x:freq){
            if(x!=0) return  false;
        }
        return true;


        // for(int i=0;i<n;i++){
        //     char c = s.charAt(i);
        //     if(!t.contains(String.valueOf(c))){
        //         return false;
        //     }
        // }
        // return true;
    }
}