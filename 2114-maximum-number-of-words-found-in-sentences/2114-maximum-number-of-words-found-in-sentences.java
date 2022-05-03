class Solution
{
    public int mostWordsFound(String[] sentences)
    {
        int ans = 0;
        for(String str : sentences)
        {
            int maxWord = 1;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==' ')
                {
                    maxWord++;
                }
            }
            ans = Math.max(ans,maxWord);
        }
        return ans;
    }
}