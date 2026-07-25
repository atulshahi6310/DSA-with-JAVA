class Solution {
    static int max(int temp){
        int max1 =0,max2 =0;
         while(temp !=0){
            int digit = temp %10;
            if(digit >=max1){
                max2 = max1;
                max1 = digit;
            }else if(digit<max1 && digit>max2){
                max2 = digit;
            }
            temp =temp /10;
        }
        int product = max1 *max2;
        return product;
        
    }
    public int maxProduct(int n) {
        int temp = n;
        int result = max(temp);
        return result;
    }
}

