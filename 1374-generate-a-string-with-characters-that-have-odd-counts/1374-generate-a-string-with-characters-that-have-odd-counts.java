class Solution
{
    public String generateTheString(int n)
    {
        char ch[] = new char[n];
        Arrays.fill(ch,'a');
        ch[0] = n%2 == 0 ? 'b' : 'a';
        
        return new String(ch);
    }
}