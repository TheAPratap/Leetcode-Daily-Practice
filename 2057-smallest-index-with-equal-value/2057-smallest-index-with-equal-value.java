class Solution
{
    public int smallestEqual(int[] nums)
    {
         boolean flag = false;
        int res = -1;
        
        for(int i = 0; i<nums.length; i++)
        {
            if(flag == false)
            {
              if(i % 10 == nums[i])
              {
                  res = i;
                  flag = true;
                  break;
              }
            }
        }
        return res;
    }
}