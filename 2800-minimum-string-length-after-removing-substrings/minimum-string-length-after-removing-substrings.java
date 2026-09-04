class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>(); // this is the stack and the space complexity is 0(n)
        for(int i=0;i<s.length();i++){
            char cur_char = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(cur_char);
                continue;
            }
            if(cur_char=='B' && stack.peek()=='A'){
                stack.pop();
            }else if(cur_char =='D'&& stack.peek()=='C'){
                stack.pop();
            }else{
                stack.push(cur_char);
            }
        }
        return stack.size();
    } // time complexity of the code is around -- 0(n)
}