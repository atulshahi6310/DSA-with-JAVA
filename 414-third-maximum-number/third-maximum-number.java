class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int n : nums) {
            long num = n;
            if (num == firstMax || num == secondMax || num == thirdMax) {
                continue;
            }
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax) {
                thirdMax = num;
            }
        }

        return (int) (thirdMax == Long.MIN_VALUE ? firstMax : thirdMax);
    }
}