class Solution {
    public int countSegments(String s) {
        int count =0;
        int i =0;
        int n = s.length();
        int j =0;

        while(i<n && s.charAt(i) == ' '){
            i++;
        }// trime the spaces till you got your fiesst word
        
        while(i<n){
            if(s.charAt(i) !=' ' && (i==0 || s.charAt(i-1) ==' ')){
                count++;
            }
            i++;
        }
        return count;
        
    }
}