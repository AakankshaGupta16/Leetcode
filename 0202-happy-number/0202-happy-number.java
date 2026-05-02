import java.util.*;

class Solution {
    public boolean isHappy(int n) 
    {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1)
        {
            if(set.contains(n)) return false;
            set.add(n);

            int s = 0;
            for(int i = n; i > 0; i /= 10)
            {
                int d = i % 10;
                s = s + d * d;
            }

            n = s;
        }

        return true;
    }
}