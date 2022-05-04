class Solution
{
    public int maxOperations(int[] nums, int k)
    {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int count=0;
        while(start<end)
        {
            if(nums[start]+nums[end]==k)
            {
                start++;
                end--;
                count++;
            }
            else if(nums[start] + nums[end] > k)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return count;
    }
}