import java.util.StringTokenizer;

class Solution
{
    public int mostWordsFound(String[] sentences)
    {
        int maxWords = 0;
        for (String s : sentences)
        {
            StringTokenizer st = new StringTokenizer(s, " ");
            int words = st.countTokens();
            maxWords = Math.max(words, maxWords);
        }
        return maxWords;
    }
}