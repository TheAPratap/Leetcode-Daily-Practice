class Solution
{
    public int removeElement(int[] nums, int val)
    {
        int eleLeft=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                continue;
            }
            else
            {
                nums[eleLeft++]=nums[i];
            }
        }
        return eleLeft;
    }
}