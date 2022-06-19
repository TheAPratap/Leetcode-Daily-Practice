class Solution
{
    public boolean isPalindrome(String s)
    {
        String fixedStr = "";
        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c) || Character.isLetter(c))
            {
                fixedStr += c;
            }
        }
        
        fixedStr = fixedStr.toLowerCase();
        
        int start = 0;
        int end = fixedStr.length()-1;
        
        while(start<end)
        {
            if(fixedStr.charAt(start)==fixedStr.charAt(end))
            {
                start++;
                end--;
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}