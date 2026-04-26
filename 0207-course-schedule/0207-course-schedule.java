class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Step 1: Build graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]); // b -> a
        }

        // 0 = unvisited, 1 = visiting, 2 = visited
        int[] vis = new int[numCourses];

        // Step 2: DFS on each node
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfs(i, vis, adj)) {
                    return false; // cycle → can't finish
                }
            }
        }

        return true;
    }

    private boolean dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj) {

        vis[node] = 1; // mark as visiting

        for (int adjNode : adj.get(node)) {

            if (vis[adjNode] == 0) {
                if (dfs(adjNode, vis, adj)) {
                    return true;
                }
            } 
            else if (vis[adjNode] == 1) {
                return true; // cycle detected
            }
        }

        vis[node] = 2; // mark as fully processed
        return false;
    }
}