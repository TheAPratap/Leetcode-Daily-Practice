class Solution
{
    public List<String> cellsInRange(String s)
    {
        char startC = s.charAt(0);
        char endC = s.charAt(3);
        char startR = s.charAt(1);
        char endR = s.charAt(4);
        
        List<String> ans = new ArrayList<>();
        for(char c = startC; c<=endC;c++)
        {
            for(char r=startR; r<=endR; r++)
            {
                ans.add(c+""+r);
            }
        }
        return ans;
    }
}