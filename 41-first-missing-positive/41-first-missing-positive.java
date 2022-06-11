class Solution
{
    void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public int firstMissingPositive(int[] arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }

        //Search for the missing number
        for(int index = 0; index < arr.length; index++)
        {
            //Case 1
            if(arr[index] != index + 1)
            {
                return index+1;
            }
        }
        //Case 2
        return arr.length+1;
    }
}