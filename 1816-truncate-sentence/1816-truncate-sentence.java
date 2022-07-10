class Solution {
    public String truncateSentence(String s, int k)
    {
        String[] strArr = s.split(" ");
        String str = "";
        
        for(int i=0;i<k;i++)
        {
            str += strArr[i] + " ";
        }
        return str.trim();
    }
}