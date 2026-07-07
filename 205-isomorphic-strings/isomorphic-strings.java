class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] charS = new int[128];
        int[] charT = new int[128];

        for(int i =0;i<s.length();i++){

            char char1 = s.charAt(i);
            char char2 = t.charAt(i);
            if(charS[char1]==0 && charT[char2]==0){
                charS[char1] = char2;
                charT[char2] = char1;
            }else{
                if(charS[char1] !=char2 && charT[char2] != char1){
                    return false;
                }
            }
        }
        return true;
    }
}