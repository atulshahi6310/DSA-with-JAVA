class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;
        
        int sum = 0;
        long number = 0;
        long place = 1;
        int temp = n;
        
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0) {
                sum += digit;
                number += (long) digit * place;
                place *= 10;
            }
            temp /= 10;
        }
        
        return number * sum;
    }
}
/*class Solution {
    public long sumAndMultiply(int n) {
        String str = Integer.toString(n);
        int sum =0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char num =str.charAt(i);
            if(num-'0' !=0){
                sum += num-'0';
                sb.append(num);
            }
        }
        if (sb.length() == 0) return 0;
        // long number = Long.parseInt(sb.toString());
        long number = Long.parseLong(sb.toString());   
        long ans = number *sum;
        return ans;
    }
}*/