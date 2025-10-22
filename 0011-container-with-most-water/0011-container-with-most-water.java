class Solution {
    public int maxArea(int[] height) 
    {
        int max=0;
        int l=0,r=height.length-1;
        while(l<r)
        {
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            int area=w*h;
            max=Math.max(area,max);
            if(height[l]<height[r])
            l++;
            else 
            r--;
        }
        return max;
        
    }
}