# Optimal Java Approach

# Intuition and Approach
<!-- Describe your first thoughts on how to solve this problem. -->
1. The idea is to maintain 2 arrays of dynamic size, store 1st element of nums array in a1 and 2nd element from nums array in a2. 
2. a1 and a2 are ArrayLists we have used as we are not aware of how many elements are going to be exactly in both.
3. Then we extract each element from nums array and if last element of a1 is greater than last element of a2 we put extracted element of nums array in a1 else for case when last element of a2 is greater than last element of a1 or both are equal we add extracted element of nums array in a2.
4. After this we normally add a1 first in result array then a2 and then we return it.

> In this problem though I have used 2 iterators i1 and i2 to keep track of last element but we can simply use arr1.get(arr1.size()-1) and arr2.get(arr2.size()-1) to access the last element.


# Complexity
- Time complexity: O(N)
We pass through array once through the size N
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:O(N)
A result of size N

<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []



class Solution 
{
    public int[] resultArray(int[] nums) 
    {
        int n=nums.length;
        int result[]=new int[n];
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        int i1=0;
        int i2=0;
        for(int i=2;i<n;i++)
        {
            if(a1.get(i1)>a2.get(i2))
            {
                a1.add(nums[i]);
                i1++;
            }
            else if(a2.get(i2)>a1.get(i1))
            {
                a2.add(nums[i]);
                i2++;

            }
            else if(a2.get(i2)==a1.get(i1))
            {
                a2.add(nums[i]);
                i2++;
            }
            
        }
        int k=0;
        for(int i=0;i<a1.size();i++)
        {
            result[k]=a1.get(i);
            k++;
        }
        for(int i=0;i<a2.size();i++)
        {
            result[k]=a2.get(i);
            k++;
        }
        return result;

    }
}
```