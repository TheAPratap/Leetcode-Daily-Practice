class Solution
{
    public int[] shuffle(int[] nums, int n)
    {
        
        int[] arr=new int[2*n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            arr[j++] = nums[i];
            // arr[j] = nums[i];
            // j++;
            arr[j++] = nums[n+i];
            // arr[j] = nums[n+i];
            // j++;
        }
        return arr;
    }
}