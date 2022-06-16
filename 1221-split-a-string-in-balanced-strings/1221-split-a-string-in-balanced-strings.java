class Solution
{
    public int balancedStringSplit(String s)
    {
        int lCounter=0, rCounter=0, Counter=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) =='R')
                rCounter++;
            else
                lCounter++;
            if(rCounter==lCounter)
                Counter++;
        }
        return Counter;
    }
}