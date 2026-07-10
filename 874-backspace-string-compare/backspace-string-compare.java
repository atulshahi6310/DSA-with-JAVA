class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int m = s.length();
        int n = t.length();
        for(int i=0;i<m;i++){
                char ch = s.charAt(i);
                if(ch!='#') sb1.append(ch);
                else
                {
                    if(sb1.length()!=0)
                    sb1.deleteCharAt(sb1.length()-1);
                }
            }
        for(int i=0;i<n;i++)
            {
                char ch = t.charAt(i);
                if(ch!='#') sb2.append(ch);
                else
                {
                    if(sb2.length()!=0)
                    sb2.deleteCharAt(sb2.length()-1);
                }
            }
        return sb1.toString().equals(sb2.toString());
    }
}