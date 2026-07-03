class Solution {
    public int numberOfSubstrings(String s) {
        int a =0,b=0,c =0;
        int left =0;
        int ans =0;
        int n = s.length();
        
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'a') a++;
            if(ch == 'b') b++;
            if(ch == 'c') c++;
            while(a>0 && b>0 && c>0){
                ans += (n-i);
                if(s.charAt(left) == 'a'){
                    a--;
                }else if(s.charAt(left) == 'b'){
                    b--;
                }else if(s.charAt(left) == 'c'){
                    c--;
                }
                left++;
            }
        }
        return ans;
        
    }
}