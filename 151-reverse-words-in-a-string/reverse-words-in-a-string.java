class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() -1;
        while(i >=0){
            // remove spaces from the last 
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int j =i;
            while(j>=0 && s.charAt(j) !=' '){
                j--;
            }
            // j will stop at the plaace space is 
            ans.append(s.substring(j+1,i+1));
            // now cheak is the j is travell along the space
            while(j>=0 && s.charAt(j) == ' '){
                j--;
            }
            if(j >=0){
                ans.append(' ');
            }
            // to change the index of the i 
            i = j;
        }
        return ans.toString();
    }
}