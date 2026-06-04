class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum = 0; 
        for (int i = num1; i <= num2; i++) {
            int waviness = 0;
            int temp = i;
            if (temp >= 100) {
                int next = temp % 10;
                temp /= 10;
                int curr = temp % 10;
                temp /= 10;
                while (temp > 0) {
                    int prev = temp % 10;
                    if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                        waviness++;
                    }
                    next = curr;
                    curr = prev;
                    temp /= 10;
                }
            }
            sum += waviness;
        }
        return sum;
    }
}