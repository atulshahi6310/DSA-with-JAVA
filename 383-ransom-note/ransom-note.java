class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] ra = new int[26];
        int[] ma = new int [26];
        // cont the 
        
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            ra[ch-'a']++;
        }

        for(int i =0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            ma[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ra[i] > ma[i]){
                return false;
            }
        }
        return true;
    }
}