class Solution {
    public int finalValueAfterOperations(String[] str)
    {
        int n=str.length;
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            if(str[i].equals("++X") || str[i].equals("X++"))
            {
                ++ans;
            }
            if(str[i].equals("--X") || str[i].equals("X--"))
            {
                --ans;
            }
        }
        return ans;
    }
}