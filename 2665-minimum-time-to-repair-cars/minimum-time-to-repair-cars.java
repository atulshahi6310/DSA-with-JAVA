class Solution {
    static boolean total_repair(int[] ranks, int cars , long mid){
        long total_repair =0;
        for(int r : ranks){
            total_repair += (long) (Math.sqrt(mid/r) + 1e-9);
        }
        return total_repair >= (long)cars;
    }
    public long repairCars(int[] ranks, int cars) {
        int max = 0;
        for(int n: ranks){
            max = Math.max(n,max);
        }
        long low = 1;
        long heigh =(long) max *cars*cars;
        long ans = heigh;
        while(low <= heigh){
            long mid= (low +heigh)/2;
            if(total_repair(ranks,cars,mid)){
                ans = mid;
                heigh = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
}