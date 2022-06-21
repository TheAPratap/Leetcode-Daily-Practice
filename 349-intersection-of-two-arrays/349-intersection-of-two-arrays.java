class Solution
{
    public int[] intersection(int[] arr1, int[] arr2)
    {
        int l1=arr1.length;
        int l2=arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
         List<Integer> list = new ArrayList<>();
        
        int i=0,j=0;
        int k=0;
        
        while(i<l1 && j<l2)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else// if(nums[i]==nums[j])
            {
                if (!list.contains(arr1[i]))
                {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        int[] result = new int[list.size()];
        for (int index = 0; index < list.size(); index++)
        {
            result[index] = list.get(index);
        }
        return result;
    }
}