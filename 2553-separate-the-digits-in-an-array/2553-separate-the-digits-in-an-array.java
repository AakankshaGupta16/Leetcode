class Solution {
    public int[] separateDigits(int[] nums) 
    {
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            ArrayList<Integer> arr=new ArrayList<>();
            arr=seperate(nums[i]);
            for( int j: arr)
            {
                ans.add(j);
            }
        }

        int[] ansarr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) 
        {
            ansarr[i] = ans.get(i);
        }

        return ansarr;
    }
    private ArrayList<Integer> seperate(int num)
    {
        
        ArrayList<Integer> sep=new ArrayList<>();
        String s = String.valueOf(num);

        // string -> char array
        char[] arr = s.toCharArray();

        // char -> int
        for (char c : arr) 
        {
            int digit = c - '0';
            sep.add(digit);
        }
        return sep;

    }
}