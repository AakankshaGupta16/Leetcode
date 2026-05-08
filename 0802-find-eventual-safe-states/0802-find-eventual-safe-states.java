class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) 
    {
        List<List<Integer>> revadj=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++)
        {
            revadj.add(new ArrayList<>());
        }
        int indeg[]=new int[n];
        for(int i=0;i<n;i++)
        {
            indeg[i]=graph[i].length; 
            for(int it:graph[i])
            {
                revadj.get(it).add(i);
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indeg[i]==0)
            q.offer(i);
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            int node=q.poll();
            ans.add(node);
            for(int neigh: revadj.get(node))
            {
                indeg[neigh]--;
                if(indeg[neigh]==0)
                q.offer(neigh);
            }
        }
       Collections.sort(ans);
       return ans;
        
    }
}