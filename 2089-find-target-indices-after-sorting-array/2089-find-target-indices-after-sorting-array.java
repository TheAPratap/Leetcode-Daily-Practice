class Solution
{
    public List<Integer> targetIndices(int[] nums, int target)
    {
        List<Integer> arr = new ArrayList<Integer>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                arr.add(i);
            }
        }
        Collections.sort(arr);
        return arr;
    }
}