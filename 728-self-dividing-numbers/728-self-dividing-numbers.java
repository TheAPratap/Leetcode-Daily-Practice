class Solution
{
    public boolean check(int n)
    {
        int x = new Integer(n);
        while(x!=0)
        {
            int y = x%10;
            if(y==0)
                return false;
            if(n%y!=0)
                return false;
            x/=10;
        }
        return true;
    }
    
    public List<Integer> selfDividingNumbers(int left, int right)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++)
        {
            if(check(i)) list.add(i);
        }
        return list;
    }
}