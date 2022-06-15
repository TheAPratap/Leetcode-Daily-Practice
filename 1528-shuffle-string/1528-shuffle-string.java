class Solution
{
    public String restoreString(String s, int[] indx)
    {
        StringBuilder sb = new StringBuilder("");
        char[] ch=new char[s.length()];
        for(int i=0; i<indx.length; i++)
        {
            ch[indx[i]] = s.charAt(i);
        }
        
        for(int i=0; i<ch.length; i++)
            sb.append(ch[i]);
        
        return sb.toString();
    }
}