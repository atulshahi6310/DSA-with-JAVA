class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int lp =0;
        int rp=tokens.length-1;
        int cs =0;
        int max_score =0;
        while(lp <=rp){
            if(power >=tokens[lp]){
                power -=tokens[lp];
                cs++;
                lp++;
                max_score = Math.max(cs,max_score);
            }else if (cs > 0) {
                power += tokens[rp];
                cs--;
                rp--;
            }
            else {
                break;
            }
        }
        return max_score;
    }
}