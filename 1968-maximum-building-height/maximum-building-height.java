class Solution {
    public int maxBuilding(int n, int[][] restrictions) {

        List<int[]> list = new ArrayList<>();

        for (int[] r : restrictions) {
            list.add(new int[]{r[0], r[1]});
        }

        list.add(new int[]{1, 0});

        Collections.sort(list, (a, b) -> a[0] - b[0]);

        int m = list.size();

        // Left -> Right
        for (int i = 1; i < m; i++) {
            list.get(i)[1] = Math.min(
                list.get(i)[1],
                list.get(i - 1)[1]
                + list.get(i)[0]
                - list.get(i - 1)[0]
            );
        }

        // Right -> Left
        for (int i = m - 2; i >= 0; i--) {
            list.get(i)[1] = Math.min(
                list.get(i)[1],
                list.get(i + 1)[1]
                + list.get(i + 1)[0]
                - list.get(i)[0]
            );
        }

        long ans = 0;

        for (int i = 1; i < m; i++) {

            long x1 = list.get(i - 1)[0];
            long h1 = list.get(i - 1)[1];

            long x2 = list.get(i)[0];
            long h2 = list.get(i)[1];

            long dist = x2 - x1;

            ans = Math.max(ans,
                    (h1 + h2 + dist) / 2);
        }

        int[] last = list.get(m - 1);

        ans = Math.max(ans,
                (long) last[1] + (n - last[0]));

        return (int) ans;
    }
}