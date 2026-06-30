class Solution {
    static boolean cheak_odd(int n){
        if(n%2 !=0){
            return true;
        }
        return false;
    }
    public String largestOddNumber(String num) {
        int n = num.length();
        int last_odd_index = -1;
        for(int i=n-1;i>=0;i--){
            char ch = num.charAt(i);
            int num1= Character.getNumericValue(ch);
            if(cheak_odd(num1)){
                last_odd_index = i;
                break;
            }
        }
        if(last_odd_index <0){
            return "";
        }
        String s = num.substring(0, last_odd_index+1);
        return  s;
    }
}