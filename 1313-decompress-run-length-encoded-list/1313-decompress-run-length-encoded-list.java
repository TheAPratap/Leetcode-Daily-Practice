class Solution
{
    public int[] decompressRLElist(int[] nums)
    {        
        if(nums == null || nums.length == 0)
        {
            //Check if an array is empty return array
            return nums;
        }
        
        int len = 0;
        for(int i=0;i<nums.length;i+=2)
        {
             len = len + nums[i];  //Define length
        }
        
        int ans[] = new int[len]; //Make new arr
        
        int k = 0;
        for(int i=0;i<nums.length;i+=2)
        {
            for(int j=1;j<=nums[i];j++)
            {
                ans[k] = nums[i+1];  //Add in new arr 
                k++;
            }
        }
        return ans;                 //Return rew arr
    }
}