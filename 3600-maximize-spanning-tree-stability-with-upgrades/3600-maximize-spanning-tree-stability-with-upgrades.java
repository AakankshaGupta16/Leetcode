import java.util.*;

class Solution {

    class DSU {
        int[] parent, rank;
        int components;

        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            components = n;

            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        boolean union(int a, int b) {
            int pa = find(a);
            int pb = find(b);

            if (pa == pb) return false;

            if (rank[pa] < rank[pb]) parent[pa] = pb;
            else if (rank[pb] < rank[pa]) parent[pb] = pa;
            else {
                parent[pb] = pa;
                rank[pa]++;
            }

            components--;
            return true;
        }
    }

    public int maxStability(int n, int[][] edges, int k) {

        int left = 1, right = 200000;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canBuild(n, edges, k, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private boolean canBuild(int n, int[][] edges, int k, int target) {

        DSU dsu = new DSU(n);
        int upgrades = 0;
        int usedEdges = 0;

        List<int[]> upgradeEdges = new ArrayList<>();

        for (int[] e : edges) {
            int u = e[0], v = e[1], s = e[2], must = e[3];

            if (must == 1) {

                if (s < target) return false;

                if (!dsu.union(u, v)) return false;

                usedEdges++;
            }
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1], s = e[2], must = e[3];

            if (must == 1) continue;

            if (s >= target) {

                if (dsu.union(u, v)) usedEdges++;

            } else if (2 * s >= target) {

                upgradeEdges.add(e);
            }
        }

        for (int[] e : upgradeEdges) {

            if (upgrades == k) break;

            int u = e[0], v = e[1];

            if (dsu.union(u, v)) {
                upgrades++;
                usedEdges++;
            }
        }

        return usedEdges == n - 1;
    }
}