class Solution {
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        int n=intervals.length;
        inter arr[]=new inter[intervals.length];
        for(int i=0;i<intervals.length;i++)
        {
            arr[i]=new inter(intervals[i][0],intervals[i][1]);

        }
        Arrays.sort(arr,(a,b)->Integer.compare(a.e,b.e));
        int f=arr[0].e;
        int c=1;
        for(int i=1;i<intervals.length;i++)
        {
            if(arr[i].s>=f)
            {
                c++;
                f=arr[i].e;
            }
        }
        return n-c;

        
    }
}
class inter
{
    int s,e;
    inter(int s,int e)
    {
        this.s=s;
        this.e=e;
    }

}