class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int j=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            else
            {
                nums[j++]=nums[i+1];
            }
        }
        return j;
    }
}