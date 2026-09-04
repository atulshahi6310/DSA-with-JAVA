class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
         for (int i=0; i<s.length(); i++) {
              char  ch = s.charAt(i);
            if (Character.isDigit(ch) && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
      
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
       return result.reverse().toString();

    }
}