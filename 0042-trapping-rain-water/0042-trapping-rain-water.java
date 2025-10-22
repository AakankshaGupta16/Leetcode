class Solution 
{
    public int trap(int[] ht) 
    {
        int lmax=0,rmax=0,l=0,r=ht.length-1;int maxtrap=0;
        while(l<=r)
        {
            if(ht[l]<=ht[r])
            {
                if(ht[l]>=lmax)
                lmax=ht[l];
                else
                maxtrap+=lmax-ht[l];
                l++;
            }
            else
            {
                if(ht[r]>=rmax)
                rmax=ht[r];
                else
                maxtrap+=rmax-ht[r];
                r--;
            }
        }
        return maxtrap;
        
    }
}

