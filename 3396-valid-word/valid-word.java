class Solution {
    public boolean isValid(String word) {
        
        word = word.toLowerCase();
        int vol_count =0;
        int const_count =0;
        if(word.length() <3) return false;
        for(int i =0;i<word.length();i++){
            if (!Character.isLetterOrDigit(word.charAt(i))) {
                return false;
            }

            if(Character.isLetter(word.charAt(i))){
                if(word.charAt(i) == 'a'||word.charAt(i) == 'e'||word.charAt(i) == 'i'||word.charAt(i) == 'o'||word.charAt(i) == 'u'){
                vol_count++;
            }else{
                const_count++;
            }
            }
            
        }
        if(vol_count >=1 && const_count >=1){
            return true;

        }
        return false;
    }
}