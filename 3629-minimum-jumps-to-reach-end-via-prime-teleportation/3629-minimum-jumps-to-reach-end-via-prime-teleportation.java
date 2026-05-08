class Solution {

    public int minJumps(int[] nums) {
        int n = nums.length;

        // prime -> list of indices divisible by prime
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Build mapping using prime factors
        for (int i = 0; i < n; i++) {
            Set<Integer> factors = getPrimeFactors(nums[i]);

            for (int f : factors) {
                map.computeIfAbsent(f, k -> new ArrayList<>()).add(i);
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(0);
        visited[0] = true;

        int jumps = 0;

        // To avoid reusing same prime teleport
        Set<Integer> usedPrime = new HashSet<>();

        while (!q.isEmpty()) {

            int size = q.size();

            for (int s = 0; s < size; s++) {

                int i = q.poll();

                // reached end
                if (i == n - 1)
                    return jumps;

                // adjacent left
                if (i - 1 >= 0 && !visited[i - 1]) {
                    visited[i - 1] = true;
                    q.offer(i - 1);
                }

                // adjacent right
                if (i + 1 < n && !visited[i + 1]) {
                    visited[i + 1] = true;
                    q.offer(i + 1);
                }

                // teleportation
                int val = nums[i];

                if (isPrime(val) && !usedPrime.contains(val)) {

                    for (int next : map.getOrDefault(val, new ArrayList<>())) {

                        if (!visited[next]) {
                            visited[next] = true;
                            q.offer(next);
                        }
                    }

                    usedPrime.add(val);
                }
            }

            jumps++;
        }

        return -1;
    }

    // Check prime
    private boolean isPrime(int x) {
        if (x < 2)
            return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }

        return true;
    }

    // Get unique prime factors
    private Set<Integer> getPrimeFactors(int x) {

        Set<Integer> set = new HashSet<>();

        for (int i = 2; i * i <= x; i++) {

            while (x % i == 0) {
                set.add(i);
                x /= i;
            }
        }

        if (x > 1)
            set.add(x);

        return set;
    }
}