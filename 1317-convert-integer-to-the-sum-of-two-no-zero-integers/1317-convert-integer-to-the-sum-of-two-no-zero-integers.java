class Solution 
{
    public int[] getNoZeroIntegers(int n) 
    {
        int i = 1;
        int j = n - 1;
        while(i <= j)
        {
            String s1 = Integer.toString(i);
            String s2 = Integer.toString(j);
            if(!s1.contains("0") && !s2.contains("0"))
            {
                return new int[]{i,j};
            }
            i++;
            j--;
        }
        return new int[0];
    }
}