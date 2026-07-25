class Solution {
    static void solve(String[] str, int index, String digits, ArrayList<String> ans, StringBuilder output) {
            // basecase -> when the index goes outof bond then our output string is ready to add in the list 
            if(index >= digits.length()){
                ans.add(output.toString());
                return;
            }
            // working 
            // find the numeric digit place at the given integer number 
            int value = digits.charAt(index) -'0';
            String mappedString = str[value] ;
            for(int i=0;i<mappedString.length();i++){
                output.append(mappedString.charAt(i));
                solve(str, index+1, digits, ans, output);
                output.deleteCharAt(output.length()-1);
            }
    }

    public List<String> letterCombinations(String digits) {
        String[] str = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        int index = 0;
        ArrayList<String> ans = new ArrayList<>();
        // recursive function call
        StringBuilder output = new StringBuilder();
        solve(str, index, digits, ans, output);
        return ans;
    }
}