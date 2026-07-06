class Solution {
    static int find(int[] arr, String s){
        int flag =1;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==0){
                flag =0;
                break;
            }
        }
        return flag;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int n = allowed.length();
       int[] arr = new int[26];
       for(int i=0;i<n;i++){
        char ch = allowed.charAt(i);
         arr[ch-'a']++;
       }
        int count =0;
        for(String s:words){
            count += find(arr,s);
        }
        return count;

    }
}

