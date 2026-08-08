class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int lp =0;
        int rp = n-1;
        int boat_count =0;
        Arrays.sort(people);
        while(lp<=rp){
            if(people[lp]+people[rp] <=limit){ /// calculate the sun of the  people  weights 
                lp++;
                rp--;
            }
            else{
                rp--;
            }
            boat_count++;
             
        }
        return boat_count;
    }
}