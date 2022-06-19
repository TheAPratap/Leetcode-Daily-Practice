class Solution
{
    private boolean isPalindrome(String str)
    {
        int s=0;
        int e=str.length()-1;
        
        while(s<e)
        {
            if(str.charAt(s)==str.charAt(e))
            {
                s++;
                e--;
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
    public String firstPalindrome(String[] words)
    {
        for(String word : words)
        {
            if(isPalindrome(word))
            {
                return word;
            }
        }
        return "";
    }
}