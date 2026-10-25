class Solution {
    static class Node {
        Node childeren[] = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                childeren[i] = null;
            }
        }
    }

    static Node root;

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if (curr.childeren[idx] == null) {
                curr.childeren[idx] = new Node();
            }
            curr = curr.childeren[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if (curr.childeren[idx] == null) {
                return false;
            }
            curr = curr.childeren[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordbreak(String word,Map<String,Boolean> memo){
        if(word.length() == 0){
            return true;
        }
         if (memo.containsKey(word)) {
            return memo.get(word);
        }
        for(int i =1;i<=word.length();i++){
            String str = word.substring(0,i);
            if(search(str)&& wordbreak(word.substring(i),memo)){
                memo.put(word, true);
                return true;
            }
        }

        memo.put(word, false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        root = new Node();
        for(int i=0;i<wordDict.size();i++){
            insert(wordDict.get(i));
        }
        return wordbreak(s,new HashMap<>());
    }
}