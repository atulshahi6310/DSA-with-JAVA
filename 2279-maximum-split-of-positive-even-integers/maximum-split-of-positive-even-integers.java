class Solution {
    public List<Long> maximumEvenSplit(long n) {
        ArrayList <Long> l = new ArrayList<>();
        if(n%2 !=0) return l; 
        long sum =n;
        long even =2;
        while(sum-even >= even+2){
                l.add(even);
                sum =sum  -even;
                even +=2;
            }
        l.add(sum);
        return l;
    }
}