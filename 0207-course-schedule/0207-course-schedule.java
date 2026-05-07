class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int [] edge: prerequisites)
        {
            int c=edge[0];
            int p=edge[1];
            adj.get(p).add(c);
            indegree[c]++;//count number of prerequisistes needed for a course
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            q.offer(i);
        }
        int c=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            c++;
            for(int neigh:adj.get(node))
            {
                indegree[neigh]--;
                if(indegree[neigh]==0)
                q.offer(neigh);
            }

        }
        return c==numCourses;

    }
}
        