class Solution
{
    public int sumOddLengthSubarrays(int[] arr)
    {
        int ans=0;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+2;j<arr.length;j=j+2)
            {
                 for(int k=i;k<j+1;k++)
                 {
                     ans=ans+arr[k];
                 }
            }
            ans=ans+arr[i];
            // System.out.println(ans);  
        }
        return ans;
    }
}