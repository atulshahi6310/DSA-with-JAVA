class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
       
        int cnt=0;
        Boolean odd=false;
        for(char ch : s.toCharArray())
        hm.put(ch, hm.getOrDefault(ch,0)+1 );
        for(int i : hm.values())
        {
            if(i%2==0)
            cnt+=i;
            else
            {
                cnt+=i-1;
                odd =true;
            }
        }
        if(odd)
        return ++cnt;
        else
        return cnt;
    }
}