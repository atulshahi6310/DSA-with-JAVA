class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        long mass1 = mass;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(mass1 >= a[i]){
                mass1 += a[i];
            }else{
                return false;
            }
        }
        return true;
    }
}