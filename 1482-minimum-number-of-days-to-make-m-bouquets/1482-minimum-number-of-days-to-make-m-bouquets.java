class Solution 
{
    public int minDays(int[] bloomDay, int m, int k) 
    {
        if ((long)m * k > bloomDay.length)
            return -1;

        int min = bloomDay[0];
        int max = bloomDay[0];

        for (int day : bloomDay)
        {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }

        int low = min;
        int high = max;
        int ans = -1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k))
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return ans;
    }

    public boolean possible(int[] arr, int day, int m, int k)
    {
        int cnt = 0;
        int bouquets = 0;

        for (int flower : arr)
        {
            if (flower <= day)
            {
                cnt++;
            }
            else
            {
                bouquets += cnt / k;
                cnt = 0;
            }
        }

        bouquets += cnt / k;

        return bouquets >= m;
    }
}