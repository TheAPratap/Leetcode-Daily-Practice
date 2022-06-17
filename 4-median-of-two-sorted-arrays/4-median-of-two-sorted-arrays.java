class Solution
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        double median = 0.0;
        int[] finalArr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, finalArr, 0, nums1.length);
        System.arraycopy(nums2, 0, finalArr, nums1.length, nums2.length);
        Arrays.sort(finalArr);
        boolean isEven = finalArr.length % 2 == 0;
        if (!isEven) 
        {
            median = finalArr[finalArr.length / 2];
        } 
        else 
        {
            median = (finalArr[finalArr.length / 2] + finalArr[finalArr.length / 2 - 1]);
        }
        return !isEven ? median : median / 2;
    }
}