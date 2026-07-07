class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char c[] = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            c[indices[i]] = s.charAt(i);
        }
        sb.append(c);
        return sb.toString();
    }
}