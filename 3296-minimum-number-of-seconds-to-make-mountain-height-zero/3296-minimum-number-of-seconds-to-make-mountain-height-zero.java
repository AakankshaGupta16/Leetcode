class Solution {

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 0;
        long right = (long)1e18;
        long ans = right;

        while (left <= right) {

            long mid = left + (right - left) / 2;

            if (canReduce(mountainHeight, workerTimes, mid)) {
                ans = mid;
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean canReduce(int mountainHeight, int[] workerTimes, long time) {

        long total = 0;

        for (int t : workerTimes) {

            // Solve t * x(x+1)/2 <= time
            double val = (double) (2.0 * time) / t;

            long x = (long)((Math.sqrt(1 + 4 * val) - 1) / 2);

            total += x;

            if (total >= mountainHeight)
                return true;
        }

        return false;
    }
}