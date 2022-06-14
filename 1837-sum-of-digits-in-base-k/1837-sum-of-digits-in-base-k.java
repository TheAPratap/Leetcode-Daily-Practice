class Solution
{
    public int sumBase(int n, int k) 
    {
        int sum=0;
        while(n>0)
        {
            int m = n%k;
            sum += m;
            n /= k;
        }
        return sum;
    }
}