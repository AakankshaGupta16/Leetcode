class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
        
        Stack <Integer> st=new Stack<>();int n=asteroids.length;
        for(int i=0;i<n;i++)
        {
            int a=asteroids[i];
            if(a>0)
            st.push(a);
            else
            {
                boolean alive=true;
                while(!st.isEmpty() && st.peek() > 0 && alive)
                {
                    if(st.peek()<Math.abs(a))
                    st.pop();
                    else if (st.peek()==Math.abs(a))
                    {
                        st.pop();
                        alive=false;
                    }
                    else
                    alive=false;

                }
                if(alive)
                st.push(a);
            }
        }
       int[] ans = new int[st.size()];

        for(int i = st.size() - 1; i >= 0; i--)
        {
            ans[i] = st.pop();
        }

        return ans;
        
    }
}