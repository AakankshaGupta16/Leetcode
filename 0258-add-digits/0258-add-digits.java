class Solution {
    public int addDigits(int num) 
    {
        
        if(num<=9) return num;
        int sum=0;
        int d;
        for(int i=num;i>0;i/=10)
        {
            d=i%10;
            sum=sum+d;

        }
        return addDigits(sum);
    }
}