class Solution
{
    private int gcd(int min, int max)
    {
        if(min==0)
        {
            return max;
        }
        return gcd(max%min,min);
    }
    public int findGCD(int[] nums)
    {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        return gcd(min, max);
    }
}