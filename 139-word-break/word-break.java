class Solution {
   static  class Node {
        Node[] childeren = new Node[26];
        boolean eow;

        public Node(){
            for(int i=0;i<26;i++){
                childeren[i] = null;
            }
        }
    }
    //create the root 
    static Node root ;

    public static void insert(String word){
        // logic of the insertion of childeren in the trie
        Node curr = root;
        for(int i=0;i<word.length();i++){
           int idx = word.charAt(i)-'a';
           if(curr.childeren[idx]==null){
            curr.childeren[idx]= new Node();
           }
           curr = curr.childeren[idx];
        }
        curr.eow = true;
    }

    //search the word in the trie
    public static boolean search(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.childeren[idx]== null){
                return false;
            }
            curr =curr.childeren[idx];
        }
        return curr.eow == true;

    }

    // wor cheak the word brak
    public static boolean breaker(String str, Map<String, Boolean> memo){ 
        if(str.length()==0){
            return true;
        }
        if (memo.containsKey(str)) {
            return memo.get(str);
        }

        for (int i = 1; i <= str.length(); i++) {
            String prefix = str.substring(0, i);
            if (search(prefix) && breaker(str.substring(i), memo)) {
                memo.put(str, true);
                return true;
            }
        }

        memo.put(str, false);
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        root = new Node();
        for(int i=0;i<wordDict.size();i++){
            insert(wordDict.get(i));
        }
        return breaker(s, new HashMap<>());

    }
}