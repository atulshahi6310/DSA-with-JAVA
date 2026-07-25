class Solution {
    public int maxProduct(int n) {
        int temp = n;
        int product =1;
        ArrayList<Integer> l = new ArrayList<>();
        while(temp !=0){
            int digit = temp %10;
            l.add(digit);
            temp =temp /10;
        }
        Collections.sort(l);
        int length = l.size();
        product = l.get(length-1) * l.get(length-2);
        return product;
    }
}
