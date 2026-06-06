class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int lp =0;
        int rp = n-1;
        int boat_count =0;
        Arrays.sort(people);
        while(lp<=rp){
            if(people[lp]+people[rp] <=limit){
                rp--;
                lp++;
            }else{
                rp--;
            }
            boat_count++;
        }
        return boat_count;
    }
}