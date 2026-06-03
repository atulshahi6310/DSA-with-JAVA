class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;

        // 1. Find the earliest possible finish time for ANY land task independently
        int minLandEnd = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minLandEnd = Math.min(minLandEnd, landStartTime[i] + landDuration[i]);
        }

        // 2. Find the earliest possible finish time for ANY water task independently
        int minWaterEnd = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            minWaterEnd = Math.min(minWaterEnd, waterStartTime[j] + waterDuration[j]);
        }

        // 3. Calculate min time for sequence: (Land -> Water)
        // We use our pre-calculated minLandEnd and test it against all water tasks
        int minLandThenWater = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            int waterStart = Math.max(minLandEnd, waterStartTime[j]);
            minLandThenWater = Math.min(minLandThenWater, waterStart + waterDuration[j]);
        }

        // 4. Calculate min time for sequence: (Water -> Land)
        // We use our pre-calculated minWaterEnd and test it against all land tasks
        int minWaterThenLand = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int landStart = Math.max(minWaterEnd, landStartTime[i]);
            minWaterThenLand = Math.min(minWaterThenLand, landStart + landDuration[i]);
        }

        // Return the absolute minimum of both sequences
        return Math.min(minLandThenWater, minWaterThenLand);
    }
}