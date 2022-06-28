class Solution
{
    public int sumOfUnique(int[] nums)
    {
        int ans = 0;
        
        int[] fre = new int[101];
        for(int num: nums)
        {
            fre[num]++;
        }
        
        for(int i=1; i<101; i++)
        {
            if(fre[i] == 1)
            {
                ans += i;
            }
        }
        
        return ans;
    }
}