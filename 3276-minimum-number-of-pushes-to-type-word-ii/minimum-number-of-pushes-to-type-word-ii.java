class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        int ans = 0;
        int assigned = 0;

        while (true) {
            int mx = 0;
            int idx = -1;

            for (int i = 0; i < 26; i++) {
                if (freq[i] > mx) {
                    mx = freq[i];
                    idx = i;
                }
            }

            if (idx == -1) {
                break;
            }

            ans += mx * (assigned / 8 + 1);
            freq[idx] = 0;
            assigned++;
        }

        return ans;
    }
}