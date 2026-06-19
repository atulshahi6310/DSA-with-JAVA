class Solution {
    public int compress(char[] chars) {
        int r_i =0;
        int w_i =0;
        while(r_i < chars.length){
            char ch = chars[r_i];
            int count =0;
            while(r_i <chars.length && ch == chars[r_i]){
                r_i++;
                count++;
            }

            chars[w_i] = ch;
            w_i++;
            if(count >1){
                String counts = String.valueOf(count);
                for(int i=0;i<counts.length();i++){
                    chars[w_i] = counts.charAt(i);
                    w_i++;
                }
            }
        }
        return w_i;
    }
}