class Solution
{
    public String reverseWords(String s)
    {
        String str[]=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(String i:str)
        {
            ans.append(new StringBuilder(i).reverse());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}