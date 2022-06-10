class Solution
{
    void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public int missingNumber(int[] arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct])
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
            if(arr[index] != index)
            {
                return index;
            }
        }
        //Case 2
        return arr.length;
    }
}