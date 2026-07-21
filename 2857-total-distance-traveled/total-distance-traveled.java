class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        //There must be atleast 5l in mainTank and 1l in additionalTank
        while( mainTank >= 5 && additionalTank >= 1){
            //Increment the distance
            distance += 10*5;
            //After travelling 50km, 5l of fuel in mainTank empties, so we add one from additionalTank
            mainTank-=4;
            //Decrementing additionalTank by 1 since we added 1l to main tank
            additionalTank-=1;
        }
        // Add remaining distance traveled using the remaining fuel in the main tank.
        // Every 1 liter in the main tank allows us to travel 10km.
        return distance + (mainTank*10);
    }
}