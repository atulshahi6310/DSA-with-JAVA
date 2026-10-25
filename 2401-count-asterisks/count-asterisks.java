class Solution {
    public int countAsterisks(String s) {
        int bar_count=0,ast_count =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='*' && bar_count%2 ==0){
                ast_count++;
            }
            if(s.charAt(i)=='|'){
                bar_count++;
            }
        }
        return ast_count;
    }
}