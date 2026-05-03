class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for(int e[] : prerequisites) {
            int u = e[0];
            int v = e[1];
            adj.get(v).add(u); // v -> u
        }

        int vis[] = new int[numCourses]; // 0,1,2 states

        for(int i = 0; i < numCourses; i++) {
            if(vis[i] == 0) {
                if(dfs(i, vis, adj)) return false; // cycle found
            }
        }
        return true; // no cycle
    }

    private boolean dfs(int node, int vis[], ArrayList<ArrayList<Integer>> adj) 
    {
        vis[node] = 1; // visiting

        for(int adjnode : adj.get(node)) {
            if(vis[adjnode] == 0) {
                if(dfs(adjnode, vis, adj)) return true;
            }
            else if(vis[adjnode] == 1) {
                return true; // cycle
            }
        }

        vis[node] = 2; // visited
        return false;
    }
}